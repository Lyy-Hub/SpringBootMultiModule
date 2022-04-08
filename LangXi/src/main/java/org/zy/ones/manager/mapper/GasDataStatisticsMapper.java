package org.zy.ones.manager.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zy.ones.manager.dto.*;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/14.
 */
public interface GasDataStatisticsMapper {
    @Select("select '供应站' as typeName,count(1) as counts from gas_station union all \n" +
            "select '配送车辆' as typeName,count(1) as counts from gas_truck union all \n" +
            "select '从业人员' as typeName,count(1) as counts from gas_person union all \n" +
            "select '气瓶' as typeName,count(1) as counts from gas_lpgcylinder")
    List<GasDataStatisticsDto> getDataStatistics();

    @Select("SELECT\n" +
            "CASE tt.qpzl \n" +
            "\tWHEN '1'THEN'液化石油气钢瓶'\n" +
            "\tWHEN '2'THEN'无缝气瓶'\n" +
            "\tWHEN '3'THEN'溶解乙炔气瓶'\n" +
            "\tWHEN '4'THEN'焊接气瓶'\n" +
            "\tWHEN '5'THEN'车用气瓶'\n" +
            "\tWHEN '6'THEN'低温绝热气瓶'\n" +
            "\tWHEN '7'THEN'铝合金无缝气瓶'\n" +
            "\tWHEN '8'THEN'液化二甲醚钢瓶'\n" +
            "\tWHEN '9'THEN'液化石油气纤维缠绕气瓶'\n" +
            "\tWHEN '10'THEN'钢制无缝气瓶'\n" +
            "\tWHEN '11'THEN'不锈钢无缝气瓶'\n" +
            "\tWHEN '12'THEN'钢制焊接气瓶'\n" +
            "\tWHEN '13'THEN'工业气瓶'\n" +
            "\tElse tt.qpzl \n" +
            "END AS qpzl,\n" +
            "\tCOUNT ( 1 ) AS counts \n" +
            "FROM gas_lpgcylinder tt GROUP BY tt.qpzl")
    List<GasCylinderTypeStatisticsDto> getCylinderTypeStatistics();

    @Select("SELECT A.gpbm AS xqName,\n" +
            "\tCOUNT ( 1 ) AS counts \n" +
            "FROM ( SELECT LEFT ( gpbm, 6 ) AS gpbm FROM gas_lpgcylinder ) A \n" +
            "GROUP BY A.gpbm")
    List<GasDistrictAndCountyStatisticsDto> getDistrictAndCountyStatistics();

    @Select("SELECT czdw AS dwName,COUNT (1) AS counts FROM gas_fillingrecord GROUP BY czdw")
    List<GasStatisticsCommonDto> getFillingCountStatistics();

    @Select("SELECT to_char( czsj, 'yyyy-mm-dd') AS DATA, COUNT (1) AS counts " +
            "FROM gas_fillingrecord where to_char( czsj, 'yyyy-mm' ) = #{data} " +
            "GROUP BY to_char( czsj,  'yyyy-mm-dd' ) " +
            "ORDER BY to_char( czsj,  'yyyy-mm-dd' ) ASC")
    List<GasRealTimeStatisticsDto> getRealTimeStatistics(@Param("data") String data);

    @Select("SELECT\n" +
            "CASE szdq \n" +
            "\tWHEN '341602' THEN\n" +
            "\t'谯城区' \n" +
            "\tWHEN '341621' THEN\n" +
            "\t'涡阳县' \n" +
            "\tWHEN '341622' THEN\n" +
            "\t'蒙城县' \n" +
            "\tWHEN '341623' THEN\n" +
            "\t'利辛县' ELSE szdq \n" +
            "END AS xqName,\n" +
            "COUNT ( 1 ) AS counts \n" +
            "FROM gas_station \n" +
            "GROUP BY szdq")
    List<GasMapMarkStatisticsDto> getMapMarkStatistics();
}
