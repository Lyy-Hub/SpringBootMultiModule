package org.zy.ones.manager.service;

import org.zy.ones.manager.entity.GasAfterFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasAfterFillingRecService {
    List<GasAfterFillingRecEntity> getGasAfterFillingRec(String czjlId);
}
