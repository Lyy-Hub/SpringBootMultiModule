package org.zy.ones.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 从业人员信息表：配送员、检查员、充装员、客户、气站管理员、其他人员
 */
@Data
@TableName("gas_person")
public class GasPersonEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("xm")
    private String xm; // 姓名
    @TableField("xb")
    private String xb; // 性别
    @TableField("lxdh")
    private String lxdh; // 联系电话
    @TableField("js")
    private String js; // 角色
    @TableField("rzsj")
    private Date rzsj; // 入职时间
    @TableField("sfzhm")
    private String sfzhm; // 身份证号码
    @TableField("zjbh")
    private String zjbh; // 证件编号
    @TableField("zjyxq")
    private Date zjyxq; // 证件有效期
    @TableField("ygzp")
    private String ygzp; // 员工照片
    @TableField("szdwid")
    private String szdwid; // 所在单位ID
    @TableField("bz")
    private String bz; // 备注
}
