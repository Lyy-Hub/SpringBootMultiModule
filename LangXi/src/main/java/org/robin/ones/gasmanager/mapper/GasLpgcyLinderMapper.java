package org.robin.ones.gasmanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.robin.ones.gasmanager.entity.GasLpgcyLinderEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasLpgcyLinderMapper extends BaseMapper<GasLpgcyLinderEntity> {

    @Select("SELECT scrq,bcjyrq FROM gas_lpgcylinder")
    List<GasLpgcyLinderEntity> selectAll();
}
