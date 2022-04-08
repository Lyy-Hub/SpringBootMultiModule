package org.robin.ones.gasmanager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasTruckEntity;
import org.robin.ones.gasmanager.mapper.GasTruckMapper;
import org.robin.ones.gasmanager.service.GasTruckService;
import org.springframework.stereotype.Service;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Service
public class GasTruckServiceImpl extends ServiceImpl<GasTruckMapper, GasTruckEntity> implements GasTruckService {
    @Override
    public Page<GasTruckEntity> getGasStationList(int page, int size, String cph, String ssdwid, String fzr,
                                                  String szdq, String ywzdqkssj, String ywzdqjssj) {
        Page<GasTruckEntity> p = new Page<>(page, size);
        QueryWrapper<GasTruckEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(cph)) wrapper.like("cph", cph);
        if (StrUtil.isNotEmpty(ssdwid)) wrapper.like("ssdwid", ssdwid);
        if (StrUtil.isNotEmpty(fzr)) wrapper.like("fzr", fzr);
        if (StrUtil.isNotEmpty(szdq)) wrapper.like("szdq", szdq);
        if (StrUtil.isNotEmpty(ywzdqkssj) && StrUtil.isNotEmpty(ywzdqjssj))
            wrapper.between("ywzdqsj", DateUtil.parse(ywzdqkssj), DateUtil.parse(ywzdqjssj));
        wrapper.orderByAsc("ywzdqsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
