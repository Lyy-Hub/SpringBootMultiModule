package org.robin.ones.gasmanager.dto;

import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 车辆位置表
 */
@Data
public class GasTruckLocationDto {
    /**
     * ID
     */
    private String id;
    /**
     * 车辆ID
     */
    private String clid;
    /**
     * 车牌号
     */
    private String cph;
    /**
     * 坐标X：WGS84经纬度坐标
     */
    private Float x;
    /**
     * 坐标y：WGS84经纬度坐标
     */
    private Float y;
    /**
     * 定位时间
     */
    private Timestamp dwsj;
    /**
     * 备注
     */
    private String bz;
}
