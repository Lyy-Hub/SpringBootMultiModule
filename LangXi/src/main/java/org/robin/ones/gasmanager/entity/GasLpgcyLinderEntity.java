package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 液化气瓶基础信息表
 */
@Data
@TableName("gas_lpgcylinder")
public class GasLpgcyLinderEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("gpbm")
    private String gpbm; // 钢瓶编码
    @TableField("ftbm")
    private String ftbm; // 阀体编码
    @TableField("czgg")
    private String czgg; // 充装规格
    @TableField("gpgg")
    private String gpgg; // 钢瓶规格
    @TableField("czjz")
    private String czjz; // 充装介质
    @TableField("gpzp")
    private String gpzp; // 钢瓶照片
    @TableField("scrq")
    private Date scrq; // 生产日期
    @TableField("sccj")
    private String sccj; // 生产厂家
    @TableField("ssdwid")
    private String ssdwid; // 所属单位ID
    @TableField("bcjyrq")
    private Date bcjyrq; // 本次检验日期
    @TableField("xcjyrq")
    private Date xcjyrq; // 下次检验日期
    @TableField("djsj")
    private Date djsj; // 定检时间
    @TableField("jzsysj")
    private Date jzsysj; // 截至使用时间
    @TableField("zzsysj")
    private Date zzsysj; // 终止使用时间
    @TableField("jydw")
    private String jydw; // 检验单位
    @TableField("qpzl")
    private String qpzl; // 气瓶种类
    @TableField("qpzt")
    private String qpzt; // 气瓶状态
    @TableField("tbsj")
    private Date tbsj; // 投保时间
    @TableField("tbht")
    private String tbht; // 投保合同
    @TableField("djbm")
    private String djbm; // 登记编码
    @TableField("zzxkz")
    private String zzxkz; // 制造许可证
    @TableField("pz")
    private String pz; // 瓶重
    @TableField("bh")
    private String bh; // 壁厚
    @TableField("gcyl")
    private String gcyl; // 公称压力MPa
    @TableField("bz")
    private String bz; // 备注
}
