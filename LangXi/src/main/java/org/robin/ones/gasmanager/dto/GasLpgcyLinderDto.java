package org.robin.ones.gasmanager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 液化气瓶基础信息表
 */
@Data
public class GasLpgcyLinderDto {
    /**
     * ID
     */
    private String id;
    /**
     * 钢瓶编码
     */
    private String gpbm;
    /**
     * 阀体编码
     */
    private String ftbm;
    /**
     * 充装规格
     */
    private String czgg;
    /**
     * 钢瓶规格
     */
    private String gpgg;
    /**
     * 充装介质
     */
    private String czjz;
    /**
     * 钢瓶照片
     */
    private String gpzp;
    /**
     * 生产日期
     */
    private Date scrq;
    /**
     * 生产厂家
     */
    private String sccj;
    /**
     * 所属单位ID
     */
    private String ssdwid;
    /**
     * 本次检验日期
     */
    private Date bcjyrq;
    /**
     * 下次检验日期
     */
    private Date xcjyrq;
    /**
     * 定检时间
     */
    private Date djsj;
    /**
     * 截至使用时间
     */
    private Date jzsysj;
    /**
     * 终止使用时间
     */
    private Date zzsysj;
    /**
     * 检验单位
     */
    private String jydw;
    /**
     * 气瓶种类
     */
    private String qpzl;
    /**
     * 气瓶状态
     */
    private String qpzt;
    /**
     * 投保时间
     */
    private Date tbsj;
    /**
     * 投保合同
     */
    private String tbht;
    /**
     * 登记编码
     */
    private String djbm;
    /**
     * 制造许可证
     */
    private String zzxkz;
    /**
     * 瓶重
     */
    private String pz;
    /**
     * 壁厚
     */
    private String bh;
    /**
     * 公称压力MPa
     */
    private String gcyl;
    /**
     * 备注
     */
    private String bz;
}
