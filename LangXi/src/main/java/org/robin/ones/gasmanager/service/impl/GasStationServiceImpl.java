package org.robin.ones.gasmanager.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasStationEntity;
import org.robin.ones.gasmanager.mapper.GasStationMapper;
import org.robin.ones.gasmanager.service.GasStationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Service
public class GasStationServiceImpl extends ServiceImpl<GasStationMapper, GasStationEntity> implements GasStationService {
    @Override
    public List<GasStationEntity> getAll() {
        return this.list();
    }

    @Override
    public int getCount() {
        return this.list().size();
    }

    @Override
    public GasStationEntity getGasStation(String id) {
        return this.getById(id);
    }

    @Override
    public Page<GasStationEntity> getGasStationList(int page, int size, String zdmc, String lxr, String szdq) {
        Page<GasStationEntity> p = new Page<>(page, size);
        QueryWrapper<GasStationEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(zdmc)) wrapper.like("zdmc", zdmc);
        if (StrUtil.isNotEmpty(lxr)) wrapper.like("lxr", lxr);
        if (StrUtil.isNotEmpty(szdq)) wrapper.eq("szdq", szdq);
        wrapper.orderByAsc("zdbh");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
