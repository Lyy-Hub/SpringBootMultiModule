package org.robin.ones.gasmanager.pojo;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/11.
 * 气瓶充装记录表
 */
@Data
public class GasFillingRecordPojo {
    /**
     * 钢瓶ID
     */
    private String gpid;
    /**
     * 充装单位
     */
    private String czdw;
    /**
     * 充装时间
     */
    private String czkssj;
    /**
     * 充装时间
     */
    private String czjssj;
    /**
     * 充装介质
     */
    private String czjz;
    /**
     * 充装员
     */
    private String czy;
    /**
     * 检查员
     */
    private String jcy;
}
