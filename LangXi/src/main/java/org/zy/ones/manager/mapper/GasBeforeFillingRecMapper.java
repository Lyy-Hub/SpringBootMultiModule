package org.zy.ones.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zy.ones.manager.entity.GasBeforeFillingRecEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/26.
 */
public interface GasBeforeFillingRecMapper extends BaseMapper<GasBeforeFillingRecEntity> {
    @Select("SELECT * FROM gas_beforefillingrec where gpid = (SELECT a.gpid FROM gas_fillingrecord a where a.id = #{czjlId})")
    List<GasBeforeFillingRecEntity> getGasBeforeFillingRec(@Param("czjlId") String czjlId);
}
