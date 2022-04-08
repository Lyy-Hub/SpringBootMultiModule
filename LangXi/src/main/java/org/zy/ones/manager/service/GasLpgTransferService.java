package org.zy.ones.manager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zy.ones.manager.entity.GasLpgTransferEntity;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasLpgTransferService extends IService<GasLpgTransferEntity> {
    Page<GasLpgTransferEntity> getGasLpgTransferList(int page, int size, String gpid, String lzkssj, String lzjssj, String zt, int sfyc, String dqwzid);
}
