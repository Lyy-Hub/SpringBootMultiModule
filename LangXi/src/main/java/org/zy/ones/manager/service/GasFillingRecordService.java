package org.zy.ones.manager.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zy.ones.manager.entity.GasFillingRecordEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/11.
 */
public interface GasFillingRecordService extends IService<GasFillingRecordEntity> {
    List<GasFillingRecordEntity> getFillingRecordStatistics();
    Page<GasFillingRecordEntity> getGasFillingRecordList(int page, int size, String gpid, String czdw, String czkssj, String czjssj, String czjz, String czy, String jcy);
}
