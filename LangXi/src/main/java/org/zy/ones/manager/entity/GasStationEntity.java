package org.zy.ones.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * Created by liYueYang on 2022/1/11.
 * 充装单位信息表
 */
@Data
@TableName("gas_station")
public class GasStationEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("zdmc")
    private String zdmc; // 站点(充装单位)名称
    @TableField("zdbh")
    private String zdbh; // 站点编号
    @TableField("zdbm")
    private String zdbm; // 站点别名
    @TableField("lxr")
    private String lxr; // 联系人
    @TableField("lxdh")
    private String lxdh; // 联系电话
    @TableField("szdq")
    private String szdq; // 所在地区(区县)
    @TableField("x")
    private Float x; // 坐标X：WGS84经纬度坐标
    @TableField("y")
    private Float y; // 坐标Y:WGS84经纬度坐标
    @TableField("xxdz")
    private String xxdz; // 详细地址
    @TableField("zdzp")
    private String zdzp; // 站点照片访问路经
    @TableField("yyzzbh")
    private String yyzzbh; // 营业执照编号
    @TableField("yyzzzp")
    private String yyzzzp; // 营业执照图片路径
    @TableField("czxkzbh")
    private String czxkzbh; // 充装许可证编号
    @TableField("czxkzdqsj")
    private Date czxkzdqsj; // 充装许可证到期时间
    @TableField("czxkzzp")
    private String czxkzzp; // 充装许可证图片路径
    @TableField("rqjyxkzbh")
    private String rqjyxkzbh; // 燃气经营许可证编号
    @TableField("rqjyxkzzp")
    private String rqjyxkzzp; // 燃气经营许可证照片
    @TableField("bz")
    private String bz; // 备用
}
