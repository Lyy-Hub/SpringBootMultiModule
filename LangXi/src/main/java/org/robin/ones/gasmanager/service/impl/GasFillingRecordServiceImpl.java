package org.robin.ones.gasmanager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasFillingRecordEntity;
import org.robin.ones.gasmanager.entity.GasPersonEntity;
import org.robin.ones.gasmanager.entity.GasStationEntity;
import org.robin.ones.gasmanager.mapper.GasFillingRecordMapper;
import org.robin.ones.gasmanager.service.GasFillingRecordService;
import org.robin.ones.gasmanager.service.GasPersonService;
import org.robin.ones.gasmanager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by liYueYang on 2022/1/11.
 */
@Service
public class GasFillingRecordServiceImpl extends ServiceImpl<GasFillingRecordMapper, GasFillingRecordEntity> implements GasFillingRecordService {

    @Autowired
    private GasPersonService gasPersonService;

    @Autowired
    private GasStationService gasStationService;

    @Override
    public List<GasFillingRecordEntity> getFillingRecordStatistics() {
        List<GasFillingRecordEntity> gasFillingRecordEntities = this.baseMapper.selectAll();
        // 字典转义
        if (gasFillingRecordEntities.size() > 0) {
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            List<GasPersonEntity> gasPersonEntities = gasPersonService.getAll();
            gasFillingRecordEntities.forEach(gasFillingRecordEntity -> {
                // 充装单位
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordEntity.getCzdw())).collect(Collectors.toList());
                if (gasStationEntityList.size() > 0) {
                    String zdmc = "";
                    if (gasStationEntityList.get(0).getBz() == null || gasStationEntityList.get(0).getBz().equals("")) {
                        zdmc = gasStationEntityList.get(0).getZdmc();
                    } else {
                        zdmc = gasStationEntityList.get(0).getBz();
                    }
                    gasFillingRecordEntity.setCzdw(zdmc);
                }
                // 充装员
                List<GasPersonEntity> gasPersonEntityList = gasPersonEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordEntity.getCzy())).collect(Collectors.toList());
                if (gasPersonEntityList.size() > 0) {
                    gasFillingRecordEntity.setCzy(gasPersonEntityList.get(0).getXm());
                }
                // 检查员
                List<GasPersonEntity> gasPersonEntityList1 = gasPersonEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordEntity.getJcy())).collect(Collectors.toList());
                if (gasPersonEntityList1.size() > 0) {
                    gasFillingRecordEntity.setJcy(gasPersonEntityList1.get(0).getXm());
                }
            });
        }
        return gasFillingRecordEntities;
    }

    @Override
    public Page<GasFillingRecordEntity> getGasFillingRecordList(int page, int size, String gpid, String czdw, String czkssj,
                                                                String czjssj, String czjz, String czy, String jcy) {
        Page<GasFillingRecordEntity> p = new Page<>(page, size);
        QueryWrapper<GasFillingRecordEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(gpid)) wrapper.like("gpid", gpid);
        if (StrUtil.isNotEmpty(czdw)) wrapper.like("czdw", czdw);
        if (StrUtil.isNotEmpty(czkssj) && StrUtil.isNotEmpty(czjssj))
            wrapper.between("czsj", DateUtil.parse(czkssj), DateUtil.parse(czjssj));
        if (StrUtil.isNotEmpty(czjz)) wrapper.like("czjz", czjz);
        if (StrUtil.isNotEmpty(czy)) wrapper.like("czy", czy);
        if (StrUtil.isNotEmpty(jcy)) wrapper.like("jcy", jcy);
        wrapper.orderByDesc("czsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
