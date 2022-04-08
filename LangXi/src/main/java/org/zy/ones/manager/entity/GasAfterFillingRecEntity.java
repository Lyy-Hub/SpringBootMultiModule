package org.zy.ones.manager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充后检查记录表
 */
@Data
@TableName("gas_afterfillingrec")
public class GasAfterFillingRecEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("gpid")
    private String gpid; // 钢瓶ID
    @TableField("czdw")
    private String czdw; // 充装站点
    @TableField("czy")
    private String czy; // 充装员
    @TableField("jcy")
    private String jcy; // 检查员
    @TableField("jcsj")
    private Timestamp jcsj; // 检查时间
    @TableField("xcjcsj")
    private Timestamp xcjcsj; // 下次检查时间
    @TableField("jielun")
    private BigDecimal jielun; // j结论是否合格
    @TableField("ptsfhg")
    private BigDecimal ptsfhg; // 瓶体是否合格
    @TableField("hzqs")
    private BigDecimal hzqs; // 护罩是否缺损
    @TableField("dzqs")
    private BigDecimal dzqs; // 底座是否缺损
    @TableField("pfqs")
    private BigDecimal pfqs; // 瓶阀是否缺损
    @TableField("hpqs")
    private BigDecimal hpqs; // 号牌是否缺损
    @TableField("wgqs")
    private BigDecimal wgqs; // 外观是否缺损
    @TableField("qpxl")
    private BigDecimal qpxl; // 制造信息是否清晰
    @TableField("sfgb")
    private BigDecimal sfgb; // 是否有效期内
    @TableField("ptwd")
    private BigDecimal ptwd; // 是否有检查标志
    @TableField("sfztjsbq")
    private BigDecimal sfztjsbq; // 是否有制造许可证
    @TableField("czlsfhg")
    private BigDecimal czlsfhg; // 是否进口气瓶
    @TableField("kpz")
    private String kpz; // 充装介质是否一致
    @TableField("czl")
    private String czl; // 警示标签是否合格
    @TableField("clfc")
    private String clfc; // 是否自有产权气瓶
    @TableField("wc")
    private String wc; // 颜色是否合格
    @TableField("bz")
    private String bz; // 备注
}
