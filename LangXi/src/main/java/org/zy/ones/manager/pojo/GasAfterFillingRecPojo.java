package org.zy.ones.manager.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充后检查记录表
 */
@Data
public class GasAfterFillingRecPojo {
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
     * 充装员
     */
    private String czy;
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
    private BigDecimal qpxl;
    /**
     * 是否有效期内
     */
    private BigDecimal sfgb;
    /**
     * 是否有检查标志
     */
    private BigDecimal ptwd;
    /**
     * 是否有制造许可证
     */
    private BigDecimal sfztjsbq;
    /**
     * 是否进口气瓶
     */
    private BigDecimal czlsfhg;
    /**
     * 充装介质是否一致
     */
    private String kpz;
    /**
     * 警示标签是否合格
     */
    private String czl;
    /**
     * 是否自有产权气瓶
     */
    private String clfc;
    /**
     * 颜色是否合格
     */
    private String wc;
    /**
     * 备注
     */
    private String bz;
}
