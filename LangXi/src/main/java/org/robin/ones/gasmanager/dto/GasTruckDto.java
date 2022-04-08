package org.robin.ones.gasmanager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 配送车辆信息表
 */
@Data
public class GasTruckDto {
    /**
     * ID
     */
    private String id;
    /**
     * 车牌号
     */
    private String cph;
    /**
     * 车辆型号
     */
    private String clxh;
    /**
     * 行驶证号
     */
    private String xszh;
    /**
     * 运危证号
     */
    private String ywzh;
    /**
     * 运危证到期时间
     */
    private Date ywzdqsj;
    /**
     * 所在地区
     */
    private String szdq;
    /**
     * 所属单位ID
     */
    private String ssdwid;
    /**
     * 负责人
     */
    private String fzr;
    /**
     * 负责人电话
     */
    private String fzrdh;
    /**
     * 备注
     */
    private String bz;
}
