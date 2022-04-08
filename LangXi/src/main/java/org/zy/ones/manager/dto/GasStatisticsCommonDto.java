package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Data
public class GasStatisticsCommonDto {
    /**
     * 单位名称
     */
    private String dwName;
    /**
     * 数量
     */
    private Integer counts;
}
