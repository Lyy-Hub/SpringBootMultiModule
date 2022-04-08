package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.robin.ones.gasmanager.entity.GasStationEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasStationService {
    List<GasStationEntity> getAll();
    int getCount();
    GasStationEntity getGasStation(String id);
    Page<GasStationEntity> getGasStationList(int page, int size, String zdmc, String lxr, String szdq);
}
