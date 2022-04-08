package org.zy.ones.manager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.zy.ones.manager.entity.GasBeforeFillingRecEntity;
import org.zy.ones.manager.mapper.GasBeforeFillingRecMapper;
import org.zy.ones.manager.service.GasBeforeFillingRecService;
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
