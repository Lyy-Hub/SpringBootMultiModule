package org.zy.ones.manager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.zy.ones.manager.entity.GasTruckEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasTruckService {
    Page<GasTruckEntity> getGasStationList(int page, int size, String cph, String ssdwid,
                                           String fzr, String szdq, String ywzdqkssj, String ywzdqjssj);
}
