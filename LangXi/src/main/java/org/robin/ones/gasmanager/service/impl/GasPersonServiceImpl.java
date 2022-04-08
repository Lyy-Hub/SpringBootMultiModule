package org.robin.ones.gasmanager.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasPersonEntity;
import org.robin.ones.gasmanager.mapper.GasPersonMapper;
import org.robin.ones.gasmanager.service.GasPersonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Service
public class GasPersonServiceImpl extends ServiceImpl<GasPersonMapper, GasPersonEntity> implements GasPersonService {
    @Override
    public List<GasPersonEntity> getAll() {
        return this.list();
    }

    @Override
    public Page<GasPersonEntity> getGasPersonList(int page, int size, String xm, String js,
                                                  String sfzhm, String zjbh, String szdwid) {
        Page<GasPersonEntity> p = new Page<>(page, size);
        QueryWrapper<GasPersonEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(xm)) wrapper.like("xm", xm);
        if (StrUtil.isNotEmpty(js)) wrapper.eq("js", js);
        if (StrUtil.isNotEmpty(sfzhm)) wrapper.like("sfzhm", sfzhm);
        if (StrUtil.isNotEmpty(zjbh)) wrapper.like("zjbh", zjbh);
        if (StrUtil.isNotEmpty(szdwid)) wrapper.like("szdwid", szdwid);
        wrapper.orderByAsc("rzsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
