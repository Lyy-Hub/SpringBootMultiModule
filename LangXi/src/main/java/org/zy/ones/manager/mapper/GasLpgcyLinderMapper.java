package org.zy.ones.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.zy.ones.manager.entity.GasLpgcyLinderEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/13.
 */
public interface GasLpgcyLinderMapper extends BaseMapper<GasLpgcyLinderEntity> {

    @Select("SELECT scrq,bcjyrq FROM gas_lpgcylinder")
    List<GasLpgcyLinderEntity> selectAll();
}
