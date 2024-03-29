package org.zy.ones.manager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zy.ones.manager.entity.GasHouseHoldCheckEntity;

/**
 * Created by liYueYang on 2022/1/18.
 */
public interface GasHouseHoldCheckService extends IService<GasHouseHoldCheckEntity> {
    Page<GasHouseHoldCheckEntity> getGasHouseHoldCheckList(int page, int size, String hzmc, String jckssj, String jcjssj);
}