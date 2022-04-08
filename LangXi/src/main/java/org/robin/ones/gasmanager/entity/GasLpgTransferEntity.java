package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 液化气瓶流转表
 */
@Data
@TableName("gas_lpgtransfer")
public class GasLpgTransferEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("gpid")
    private String gpid; // 钢瓶id
    @TableField("ftbm")
    private String ftbm; // 阀体编码
    @TableField("zt")
    private String zt; // 状态（重瓶/新瓶/使用中）
    @TableField("sfyc")
    private BigDecimal sfyc; // 是否异常 0:否1：是
    @TableField("sqwz")
    private String sqwz; // 当前位置:0：气站；1：送气工；2：用户
    @TableField("dqwzid")
    private String dqwzid; // 当前位置ID：气站\送气工\用户对应ID
    @TableField("lzly")
    private String lzly; // 流转来源
    @TableField("lzsj")
    private Timestamp lzsj; // 流转时间
    @TableField("bz")
    private String bz; // 备注
}
