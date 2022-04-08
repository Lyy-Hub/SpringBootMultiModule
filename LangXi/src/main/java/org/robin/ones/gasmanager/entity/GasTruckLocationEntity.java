package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 车辆位置表
 */
@Data
@TableName("gas_trucklocation")
public class GasTruckLocationEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("clid")
    private String clid; // 车辆ID
    @TableField("cph")
    private String cph; // 车牌号
    @TableField("x")
    private Float x; // 坐标X：WGS84经纬度坐标
    @TableField("y")
    private Float y; // 坐标y：WGS84经纬度坐标
    @TableField("dwsj")
    private Timestamp dwsj; // 定位时间
    @TableField("bz")
    private String bz; // 备注
}
