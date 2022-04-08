package org.robin.ones.gasmanager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.robin.ones.gasmanager.entity.GasPersonEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasPersonService {
    List<GasPersonEntity> getAll();

    Page<GasPersonEntity> getGasPersonList(int page, int size, String xm, String js, String sfzhm, String zjbh, String szdwid);
}
