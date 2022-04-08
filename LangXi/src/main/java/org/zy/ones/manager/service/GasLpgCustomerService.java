package org.zy.ones.manager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zy.ones.manager.entity.GasLpgCustomerEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
public interface GasLpgCustomerService extends IService<GasLpgCustomerEntity> {
    Page<GasLpgCustomerEntity> getGasLpgCustomerList(int page, int size, String xm, String lxdh);
}
