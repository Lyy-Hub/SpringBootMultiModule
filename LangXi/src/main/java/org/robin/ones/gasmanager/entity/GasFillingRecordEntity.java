package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充装记录表
 */
@Data
@TableName("gas_fillingrecord")
public class GasFillingRecordEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("gpid")
    private String gpid; // 钢瓶ID
    @TableField("czdw")
    private String czdw; // 充装单位
    @TableField("czsj")
    private Date czsj; // 充装时间
    @TableField("gpgg")
    private String gpgg; // 钢瓶规格
    @TableField("czgg")
    private String czgg; // 充装规格
    @TableField("czjz")
    private String czjz; // 充装介质
    @TableField("czy")
    private String czy; // 充装员
    @TableField("jcy")
    private String jcy; // 检查员
    @TableField("czqh")
    private String czqh; // 充装枪号
    @TableField("ftbm")
    private String ftbm; // 阀体编码
    @TableField("czcs")
    private String czcs; // 充装次数
    @TableField("scczsj")
    private Date scczsj; // 上次充装时间
    @TableField("bz")
    private String bz; // 备注

    /**
     * 钢瓶编码
     */
    @TableField(exist = false)
    private String gpbm;
    /**
     * 下次检验日期
     */
    @TableField(exist = false)
    private Date xcjyrq;

    /**
     * 站点(充装单位)名称
     */
    @TableField(exist = false)
    private String zdmc;
}
