package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.robin.ones.gasmanager.entity.GasTruckEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasTruckService {
    Page<GasTruckEntity> getGasStationList(int page, int size, String cph, String ssdwid,
                                           String fzr, String szdq, String ywzdqkssj, String ywzdqjssj);
}
