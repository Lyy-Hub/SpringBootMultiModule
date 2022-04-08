package org.zy.ones.manager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 从业人员信息表：配送员、检查员、充装员、客户、气站管理员、其他人员
 */
@Data
public class GasPersonDto {
    /**
     * ID
     */
    private String id;
    /**
     * 姓名
     */
    private String xm;
    /**
     * 性别
     */
    private String xb;
    /**
     * 联系电话
     */
    private String lxdh;
    /**
     * 角色
     */
    private String js;
    /**
     * 入职时间
     */
    private Date rzsj;
    /**
     * 身份证号码
     */
    private String sfzhm;
    /**
     * 证件编号
     */
    private String zjbh;
    /**
     * 证件有效期
     */
    private Date zjyxq;
    /**
     * 员工照片
     */
    private String ygzp;
    /**
     * 所在单位ID
     */
    private String szdwid;
    /**
     * 备注
     */
    private String bz;
}
