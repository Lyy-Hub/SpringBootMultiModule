package org.robin.ones.gasmanager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.robin.ones.gasmanager.entity.GasAfterFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasAfterFillingRecMapper extends BaseMapper<GasAfterFillingRecEntity> {
    @Select("SELECT * FROM gas_afterfillingrec where gpid = (SELECT a.gpid FROM gas_fillingrecord a where a.id = #{czjlId})")
    List<GasAfterFillingRecEntity> getGasAfterFillingRec(@Param("czjlId") String czjlId);
}
