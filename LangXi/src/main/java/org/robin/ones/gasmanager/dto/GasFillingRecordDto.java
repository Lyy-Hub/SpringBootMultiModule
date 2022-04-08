package org.robin.ones.gasmanager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充装记录表
 */
@Data
public class GasFillingRecordDto {
    /**
     * ID
     */
    private String id;
    /**
     * 钢瓶ID
     */
    private String gpid;
    /**
     * 充装单位
     */
    private String czdw;
    /**
     * 充装时间
     */
    private Date czsj;
    /**
     * 钢瓶规格
     */
    private String gpgg;
    /**
     * 充装规格
     */
    private String czgg;
    /**
     * 充装介质
     */
    private String czjz;
    /**
     * 充装员
     */
    private String czy;
    /**
     * 检查员
     */
    private String jcy;
    /**
     * 充装枪号
     */
    private String czqh;
    /**
     * 阀体编码
     */
    private String ftbm;
    /**
     * 充装次数
     */
    private String czcs;
    /**
     * 上次充装时间
     */
    private Date scczsj;
    /**
     * 备注
     */
    private String bz;


    /**
     * 钢瓶编码
     */
    private String gpbm;
    /**
     * 下次检验日期
     */
    private Date xcjyrq;

    /**
     * 站点(充装单位)名称
     */
    private String zdmc;
}
