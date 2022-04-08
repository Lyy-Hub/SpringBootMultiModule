package org.robin.ones.gasmanager.service;

import org.robin.ones.gasmanager.entity.GasAfterFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasAfterFillingRecService {
    List<GasAfterFillingRecEntity> getGasAfterFillingRec(String czjlId);
}
