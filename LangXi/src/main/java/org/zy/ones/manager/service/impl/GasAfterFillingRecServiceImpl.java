package org.zy.ones.manager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zy.ones.manager.entity.GasAfterFillingRecEntity;
import org.zy.ones.manager.mapper.GasAfterFillingRecMapper;
import org.zy.ones.manager.service.GasAfterFillingRecService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
@Service
public class GasAfterFillingRecServiceImpl extends ServiceImpl<GasAfterFillingRecMapper, GasAfterFillingRecEntity> implements GasAfterFillingRecService {
    @Override
    public List<GasAfterFillingRecEntity> getGasAfterFillingRec(String czjlId) {
        return this.baseMapper.getGasAfterFillingRec(czjlId);
    }
}
