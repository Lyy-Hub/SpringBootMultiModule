package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.robin.ones.gasmanager.entity.GasLpgCustomerEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
public interface GasLpgCustomerService extends IService<GasLpgCustomerEntity> {
    Page<GasLpgCustomerEntity> getGasLpgCustomerList(int page, int size, String xm, String lxdh);
}
