package org.zy.ones.manager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zy.ones.manager.entity.GasHouseHoldCheckEntity;
import org.zy.ones.manager.mapper.GasHouseHoldCheckMapper;
import org.zy.ones.manager.service.GasHouseHoldCheckService;
import org.springframework.stereotype.Service;

/**
 * Created by liYueYang on 2022/1/18.
 */
@Service
public class GasHouseHoldCheckServiceImpl extends ServiceImpl<GasHouseHoldCheckMapper, GasHouseHoldCheckEntity> implements GasHouseHoldCheckService {
    @Override
    public Page<GasHouseHoldCheckEntity> getGasHouseHoldCheckList(int page, int size, String hzmc, String jckssj, String jcjssj) {
        Page<GasHouseHoldCheckEntity> p = new Page<>(page, size);
        QueryWrapper<GasHouseHoldCheckEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(hzmc)) wrapper.like("hzmc", hzmc);
        if (StrUtil.isNotEmpty(jckssj) && StrUtil.isNotEmpty(jcjssj))
            wrapper.between("jcsj", DateUtil.parse(jckssj), DateUtil.parse(jcjssj));
        wrapper.orderByDesc("jcsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
