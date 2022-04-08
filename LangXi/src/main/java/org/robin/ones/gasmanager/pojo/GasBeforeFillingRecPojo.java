package org.robin.ones.gasmanager.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充前检查记录表
 */
@Data
public class GasBeforeFillingRecPojo {
    /**
     * ID
     */
    private String id;
    /**
     * 钢瓶ID
     */
    private String gpid;
    /**
     * 充装站点
     */
    private String czdw;
    /**
     * 检查员
     */
    private String jcy;
    /**
     * 检查时间
     */
    private Timestamp jcsj;
    /**
     * 下次检查时间
     */
    private Timestamp xcjcsj;
    /**
     * j结论是否合格
     */
    private BigDecimal jielun;
    /**
     * 瓶体是否合格
     */
    private BigDecimal ptsfhg;
    /**
     * 护罩是否缺损
     */
    private BigDecimal hzqs;
    /**
     * 底座是否缺损
     */
    private BigDecimal dzqs;
    /**
     * 瓶阀是否缺损
     */
    private BigDecimal pfqs;
    /**
     * 号牌是否缺损
     */
    private BigDecimal hpqs;
    /**
     * 外观是否缺损
     */
    private BigDecimal wgqs;
    /**
     * 制造信息是否清晰
     */
    private BigDecimal zzxxsfqx;
    /**
     * 是否有效期内
     */
    private BigDecimal yxqn;
    /**
     * 是否有检查标志
     */
    private BigDecimal yjcbz;
    /**
     * 是否有制造许可证
     */
    private BigDecimal zzxkz;
    /**
     * 是否进口气瓶
     */
    private BigDecimal jkqp;
    /**
     * 充装介质是否一致
     */
    private BigDecimal czjzsfyz;
    /**
     * 警示标签是否合格
     */
    private BigDecimal jsbqsfhg;
    /**
     * 是否自有产权气瓶
     */
    private BigDecimal zycqqp;
    /**
     * 颜色是否合格
     */
    private BigDecimal yssfhg;
    /**
     * 螺纹型式是否符合
     */
    private BigDecimal lwxsfh;
    /**
     * 是否有余压
     */
    private BigDecimal sfyyy;
    /**
     * 安全附件是否齐全
     */
    private BigDecimal aqfjqq;
    /**
     * 备注
     */
    private BigDecimal bz;
}
