package org.robin.ones.gasmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.robin.ones.gasmanager.entity.GasBeforeFillingRecEntity;
import org.robin.ones.gasmanager.mapper.GasBeforeFillingRecMapper;
import org.robin.ones.gasmanager.service.GasBeforeFillingRecService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
@Service
public class GasBeforeFillingRecServiceImpl extends ServiceImpl<GasBeforeFillingRecMapper, GasBeforeFillingRecEntity> implements GasBeforeFillingRecService {
    @Override
    public List<GasBeforeFillingRecEntity> getGasBeforeFillingRec(String czjlId) {
        return this.baseMapper.getGasBeforeFillingRec(czjlId);
    }
}
