package org.zy.ones.manager.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 入户安检记录表
 */
@Data
public class GasHouseHoldCheckDto {
    /**
     * ID
     */
    private String id;
    /**
     * 户主名称
     */
    private String hzmc;
    /**
     * 用户ID
     */
    private String yhid;
    /**
     * 户主电话
     */
    private String hzdh;
    /**
     * 户主地址
     */
    private String hzdz;
    /**
     * 钢瓶ID
     */
    private String gpid;
    /**
     * 检查时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    private Timestamp jcsj;
    /**
     * 检测人
     */
    private String jcr;
    /**
     * 检测照片
     */
    private String jczp;
    /**
     * 检测签名
     */
    private String jcqm;
    /**
     * 减压阀是否合格
     */
    private BigDecimal jyf;
    /**
     * 通风是否合格
     */
    private BigDecimal tongfeng;
    /**
     * 灶具是否合格
     */
    private BigDecimal zaoju;
    /**
     * 安装位置是否合格
     */
    private BigDecimal azwz;
    /**
     * 胶管是否合格
     */
    private BigDecimal jiaoguan;
    /**
     * 是否多家气源
     */
    private BigDecimal sfdjqy;
    /**
     * 是否有效期内
     */
    private BigDecimal yxqn;
    /**
     * 是否有检查标志
     */
    private BigDecimal jcbz;
    /**
     * 钢瓶是否合格
     */
    private BigDecimal gangping;
    /**
     * 结论是否合格
     */
    private BigDecimal jielun;
    /**
     * 备注
     */
    private String bz;
}
