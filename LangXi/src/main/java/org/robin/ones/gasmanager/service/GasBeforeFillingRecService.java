package org.robin.ones.gasmanager.service;

import org.robin.ones.gasmanager.entity.GasBeforeFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasBeforeFillingRecService {
    List<GasBeforeFillingRecEntity> getGasBeforeFillingRec(String czjlId);
}
