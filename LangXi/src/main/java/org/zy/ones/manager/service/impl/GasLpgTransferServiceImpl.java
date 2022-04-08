package org.zy.ones.manager.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zy.ones.manager.entity.GasLpgTransferEntity;
import org.zy.ones.manager.mapper.GasLpgTransferMapper;
import org.zy.ones.manager.service.GasLpgTransferService;
import org.springframework.stereotype.Service;

/**
 * Created by liYueYang on 2022/1/13.
 */
@Service
public class GasLpgTransferServiceImpl extends ServiceImpl<GasLpgTransferMapper, GasLpgTransferEntity> implements GasLpgTransferService {
    @Override
    public Page<GasLpgTransferEntity> getGasLpgTransferList(int page, int size, String gpid, String lzkssj, String lzjssj, String zt, int sfyc, String dqwzid) {
        Page<GasLpgTransferEntity> p = new Page<>(page, size);
        QueryWrapper<GasLpgTransferEntity> wrapper = new QueryWrapper<>();
        if (StrUtil.isNotEmpty(gpid)) wrapper.like("gpid", gpid);
        if (StrUtil.isNotEmpty(lzkssj) && StrUtil.isNotEmpty(lzjssj))
            wrapper.between("lzsj", DateUtil.parse(lzkssj), DateUtil.parse(lzjssj));
        if (StrUtil.isNotEmpty(zt)) wrapper.eq("zt", zt);
        if (StrUtil.isNotEmpty(String.valueOf(sfyc))) wrapper.eq("sfyc", sfyc);
        if (StrUtil.isNotEmpty(dqwzid)) wrapper.like("dqwzid", dqwzid);
        wrapper.orderByDesc("lzsj");
        return this.getBaseMapper().selectPage(p, wrapper);
    }
}
