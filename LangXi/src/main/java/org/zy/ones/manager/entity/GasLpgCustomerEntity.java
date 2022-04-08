package org.zy.ones.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 *液化气瓶用户表
 */
@Data
@TableName("gas_lpgcustomer")
public class GasLpgCustomerEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("xm")
    private String xm; // 姓名
    @TableField("yhzh")
    private String yhzh; // 用户账号
    @TableField("xb")
    private String xb; // 性别
    @TableField("lxdh")
    private String lxdh; // 联系电话
    @TableField("jtzz")
    private String jtzz; // 家庭住址
    @TableField("szqh")
    private String szqh; // 所在区划
    @TableField("sfzhm")
    private String sfzhm; // 身份证号码
    @TableField("khsj")
    private Date khsj; // 开户时间
    @TableField("bz")
    private String bz; // 备注
}
