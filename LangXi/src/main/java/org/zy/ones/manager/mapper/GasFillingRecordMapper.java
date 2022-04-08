package org.zy.ones.manager.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.zy.ones.manager.entity.GasFillingRecordEntity;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/11.
 */
public interface GasFillingRecordMapper extends BaseMapper<GasFillingRecordEntity> {
    @Select("SELECT b.gpbm,c.zdmc,a.czdw,a.czsj,a.gpgg,a.czjz,a.czy,a.jcy,a.czcs,b.xcjyrq \n" +
            "FROM gas_fillingrecord a\n" +
            "LEFT JOIN gas_lpgcylinder b ON A.gpid = b.ID \n" +
            "LEFT JOIN gas_station c ON A.czdw = c.ID \n" +
            "WHERE to_char( A.czsj, 'yyyy-mm' ) = to_char( now( ), 'yyyy-mm' ) \n" +
            "ORDER BY A.czsj DESC limit 20")
    List<GasFillingRecordEntity> selectAll();
}
