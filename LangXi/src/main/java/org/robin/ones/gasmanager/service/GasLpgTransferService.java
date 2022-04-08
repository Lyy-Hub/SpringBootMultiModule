package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.robin.ones.gasmanager.entity.GasLpgTransferEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasLpgTransferService extends IService<GasLpgTransferEntity> {
    Page<GasLpgTransferEntity> getGasLpgTransferList(int page, int size, String gpid, String lzkssj, String lzjssj, String zt, int sfyc, String dqwzid);
}
