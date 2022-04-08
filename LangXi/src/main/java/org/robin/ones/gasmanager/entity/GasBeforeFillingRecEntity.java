package org.robin.ones.gasmanager.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充前检查记录表
 */
@Data
@TableName("gas_beforefillingrec")
public class GasBeforeFillingRecEntity {
    @TableId
    @TableField("id")
    private String id; // ID
    @TableField("gpid")
    private String gpid; // 钢瓶ID
    @TableField("czdw")
    private String czdw; // 充装站点
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
    @TableField("zzxxsfqx")
    private BigDecimal zzxxsfqx; // 制造信息是否清晰
    @TableField("yxqn")
    private BigDecimal yxqn; // 是否有效期内
    @TableField("yjcbz")
    private BigDecimal yjcbz; // 是否有检查标志
    @TableField("zzxkz")
    private BigDecimal zzxkz; // 是否有制造许可证
    @TableField("jkqp")
    private BigDecimal jkqp; // 是否进口气瓶
    @TableField("czjzsfyz")
    private BigDecimal czjzsfyz; // 充装介质是否一致
    @TableField("jsbqsfhg")
    private BigDecimal jsbqsfhg; // 警示标签是否合格
    @TableField("zycqqp")
    private BigDecimal zycqqp; // 是否自有产权气瓶
    @TableField("yssfhg")
    private BigDecimal yssfhg; // 颜色是否合格
    @TableField("lwxsfh")
    private BigDecimal lwxsfh; // 螺纹型式是否符合
    @TableField("sfyyy")
    private BigDecimal sfyyy; // 是否有余压
    @TableField("aqfjqq")
    private BigDecimal aqfjqq; // 安全附件是否齐全
    @TableField("bz")
    private BigDecimal bz; // 备注
}
