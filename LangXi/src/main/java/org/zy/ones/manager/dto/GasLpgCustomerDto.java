package org.zy.ones.manager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 液化气瓶用户表
 */
@Data
public class GasLpgCustomerDto {
    /**
     * ID
     */
    private String id;
    /**
     * 姓名
     */
    private String xm;
    /**
     * 用户账号
     */
    private String yhzh;
    /**
     * 性别
     */
    private String xb;
    /**
     * 联系电话
     */
    private String lxdh;
    /**
     * 家庭住址
     */
    private String jtzz;
    /**
     * 所在区划
     */
    private String szqh;
    /**
     * 身份证号码
     */
    private String sfzhm;
    /**
     * 开户时间
     */
    private Date khsj;
    /**
     * 备注
     */
    private String bz;
}
