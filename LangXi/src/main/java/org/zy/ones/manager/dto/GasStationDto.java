package org.zy.ones.manager.dto;

import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 充装单位信息表
 */
@Data
public class GasStationDto {
    /**
     * ID
     */
    private String id;
    /**
     * 站点(充装单位)名称
     */
    private String zdmc;
    /**
     * 站点编号
     */
    private String zdbh;
    /**
     * 站点别名
     */
    private String zdbm;
    /**
     * 联系人
     */
    private String lxr;
    /**
     * 联系电话
     */
    private String lxdh;
    /**
     * 所在地区(区县)
     */
    private String szdq;
    /**
     * 坐标X：WGS84经纬度坐标
     */
    private Float x;
    /**
     * 坐标Y:WGS84经纬度坐标
     */
    private Float y;
    /**
     * 详细地址
     */
    private String xxdz;
    /**
     * 站点照片访问路经
     */
    private String zdzp;
    /**
     * 营业执照编号
     */
    private String yyzzbh;
    /**
     * 营业执照图片路径
     */
    private String yyzzzp;
    /**
     * 充装许可证编号
     */
    private String czxkzbh;
    /**
     * 充装许可证到期时间
     */
    private Date czxkzdqsj;
    /**
     * 充装许可证图片路径
     */
    private String czxkzzp;
    /**
     * 燃气经营许可证编号
     */
    private String rqjyxkzbh;
    /**
     * 燃气经营许可证照片
     */
    private String rqjyxkzzp;
    /**
     * 备用
     */
    private String bz;
}
