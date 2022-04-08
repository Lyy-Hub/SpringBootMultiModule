package org.robin.ones.gasmanager.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasLpgCustomerEntity;
import org.robin.ones.gasmanager.mapper.GasLpgCustomerMapper;
import org.robin.ones.gasmanager.service.GasLpgCustomerService;
import org.springframework.stereotype.Service;

/**
 * Created by liYueYang on 2022/1/18.
 */
@Service
public class GasLpgCustomerServiceImpl extends ServiceImpl<GasLpgCustomerMapper, GasLpgCustomerEntity> implements GasLpgCustomerService {
    @Override
    public Page<GasLpgCustomerEntity> getGasLpgCustomerList(int page, int size, String xm, String lxdh) {
        Page<GasLpgCustomerEntity> p = new Page<>(page, size);
        QueryWrapper<GasLpgCustomerEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(xm)) wrapper.like("xm", xm);
        if (StrUtil.isNotEmpty(lxdh)) wrapper.eq("lxdh", lxdh);
        wrapper.orderByDesc("khsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
