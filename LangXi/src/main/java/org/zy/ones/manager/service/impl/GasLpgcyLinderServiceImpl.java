package org.zy.ones.manager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zy.ones.manager.entity.GasLpgcyLinderEntity;
import org.zy.ones.manager.entity.GasStationEntity;
import org.zy.ones.manager.mapper.GasLpgcyLinderMapper;
import org.zy.ones.manager.service.GasLpgcyLinderService;
import org.zy.ones.manager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Service
public class GasLpgcyLinderServiceImpl extends ServiceImpl<GasLpgcyLinderMapper, GasLpgcyLinderEntity> implements GasLpgcyLinderService {

    @Autowired
    private GasStationService gasStationService;

    @Override
    public Page<GasLpgcyLinderEntity> getGasLpgcyLinderList(int page, int size, String gpbm, String gpgg, String ssdwid, String sccj, String bcjyksrq,
                                                            String bcjyjsrq, String zzsykssj, String zzsyjssj, String jydw, String qpzl, String qpzt) {
        Page<GasLpgcyLinderEntity> p = new Page<>(page, size);
        QueryWrapper<GasLpgcyLinderEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(gpbm)) wrapper.like("gpbm", gpbm);
        if (StrUtil.isNotEmpty(gpgg)) wrapper.like("gpgg", gpgg);
        if (StrUtil.isNotEmpty(ssdwid)) wrapper.eq("ssdwid", ssdwid);
        if (StrUtil.isNotEmpty(sccj)) wrapper.like("sccj", sccj);
        if (StrUtil.isNotEmpty(bcjyksrq) && StrUtil.isNotEmpty(bcjyjsrq))
            wrapper.between("bcjyrq", DateUtil.parse(bcjyksrq), DateUtil.parse(bcjyjsrq));
        if (StrUtil.isNotEmpty(zzsykssj) && StrUtil.isNotEmpty(zzsyjssj))
            wrapper.between("zzsysj", DateUtil.parse(zzsykssj), DateUtil.parse(zzsyjssj));
        if (StrUtil.isNotEmpty(jydw)) wrapper.like("jydw", jydw);
        if (StrUtil.isNotEmpty(qpzl)) wrapper.eq("qpzl", qpzl);
        if (StrUtil.isNotEmpty(qpzt)) wrapper.eq("qpzt", qpzt);
        wrapper.orderByAsc("gpbm");
        // 字典转义
        Page<GasLpgcyLinderEntity> page1 = this.getBaseMapper().selectPage(p, wrapper);
        List<GasLpgcyLinderEntity> gasLpgcyLinderEntities = page1.getRecords();
        if (gasLpgcyLinderEntities.size() > 0) {
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            gasLpgcyLinderEntities.forEach(gasLpgcyLinderEntity -> {
                // 充装单位
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasLpgcyLinderEntity.getSsdwid())).collect(Collectors.toList());
                if (gasStationEntityList.size() > 0) {
                    String zdmc = "";
                    if (gasStationEntityList.get(0).getBz() == null || gasStationEntityList.get(0).getBz().equals("")) {
                        zdmc = gasStationEntityList.get(0).getZdmc();
                    } else {
                        zdmc = gasStationEntityList.get(0).getBz();
                    }
                    gasLpgcyLinderEntity.setSsdwid(zdmc);
                }
            });
        }
        return page1;
    }
}
