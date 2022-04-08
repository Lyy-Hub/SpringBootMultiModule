package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.robin.ones.gasmanager.entity.GasLpgcyLinderEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasLpgcyLinderService extends IService<GasLpgcyLinderEntity> {

    Page<GasLpgcyLinderEntity> getGasLpgcyLinderList(int page, int size, String gpbm, String gpgg, String ssdwid, String sccj, String bcjyksrq,
                                                     String bcjyjsrq, String zzsykssj, String zzsyjssj, String jydw, String qpzl, String qpzt);

}
