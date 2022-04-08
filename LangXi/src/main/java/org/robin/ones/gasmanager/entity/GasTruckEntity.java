package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 配送车辆信息表
 */
@Data
@TableName("gas_truck")
public class GasTruckEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("cph")
    private String cph; // 车牌号
    @TableField("clxh")
    private String clxh; // 车辆型号
    @TableField("xszh")
    private String xszh; // 行驶证号
    @TableField("ywzh")
    private String ywzh; // 运危证号
    @TableField("ywzdqsj")
    private Date ywzdqsj; // 运危证到期时间
    @TableField("szdq")
    private String szdq; // 所在地区
    @TableField("ssdwid")
    private String ssdwid; // 所属单位ID
    @TableField("fzr")
    private String fzr; // 负责人
    @TableField("fzrdh")
    private String fzrdh; // 负责人电话
    @TableField("bz")
    private String bz; // 备注
}
