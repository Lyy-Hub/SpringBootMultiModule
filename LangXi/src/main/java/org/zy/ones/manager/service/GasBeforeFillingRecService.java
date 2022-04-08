package org.zy.ones.manager.service;

import org.zy.ones.manager.entity.GasBeforeFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasBeforeFillingRecService {
    List<GasBeforeFillingRecEntity> getGasBeforeFillingRec(String czjlId);
}
