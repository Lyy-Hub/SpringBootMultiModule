package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 入户安检记录表
 */
@Data
@TableName("gas_householdcheck")
public class GasHouseHoldCheckEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("hzmc")
    private String hzmc; // 户主名称
    @TableField("yhid")
    private String yhid; // 用户ID
    @TableField("hzdh")
    private String hzdh; // 户主电话
    @TableField("hzdz")
    private String hzdz; // 户主地址
    @TableField("gpid")
    private String gpid; // 钢瓶ID
    @TableField("jcsj")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    private Timestamp jcsj; // 检查时间
    @TableField("jcr")
    private String jcr; // 检测人
    @TableField("jczp")
    private String jczp; // 检测照片
    @TableField("jcqm")
    private String jcqm; // 检测签名
    @TableField("jyf")
    private BigDecimal jyf; // 减压阀是否合格
    @TableField("tongfeng")
    private BigDecimal tongfeng; // 通风是否合格
    @TableField("zaoju")
    private BigDecimal zaoju; // 灶具是否合格
    @TableField("azwz")
    private BigDecimal azwz; // 安装位置是否合格
    @TableField("jiaoguan")
    private BigDecimal jiaoguan; // 胶管是否合格
    @TableField("sfdjqy")
    private BigDecimal sfdjqy; // 是否多家气源
    @TableField("yxqn")
    private BigDecimal yxqn; // 是否有效期内
    @TableField("jcbz")
    private BigDecimal jcbz; // 是否有检查标志
    @TableField("gangping")
    private BigDecimal gangping; // 钢瓶是否合格
    @TableField("jielun")
    private BigDecimal jielun; // 结论是否合格
    @TableField("bz")
    private String bz; // 备注
}
