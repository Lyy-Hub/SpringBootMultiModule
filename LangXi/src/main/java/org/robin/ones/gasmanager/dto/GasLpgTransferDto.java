package org.robin.ones.gasmanager.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 液化气瓶流转表
 */
@Data
public class GasLpgTransferDto {
    /**
     * ID
     */
    private String id;
    /**
     * 钢瓶id
     */
    private String gpid;
    /**
     * 阀体编码
     */
    private String ftbm;
    /**
     * 状态（重瓶/新瓶/使用中）
     */
    private String zt;
    /**
     * 是否异常 0:否1：是
     */
    private BigDecimal sfyc;
    /**
     * 当前位置:0：气站；1：送气工；2：用户
     */
    private String sqwz;
    /**
     * 当前位置ID：气站\送气工\用户对应ID
     */
    private String dqwzid;
    /**
     * 流转来源
     */
    private String lzly;
    /**
     * 流转时间
     */
    private Timestamp lzsj;
    /**
     * 备注
     */
    private String bz;
}
