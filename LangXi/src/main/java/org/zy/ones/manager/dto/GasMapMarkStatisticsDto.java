package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/17.
 */
@Data
public class GasMapMarkStatisticsDto {
    /**
     * 县区名称
     */
    private String xqName;
    /**
     * 气站数量
     */
    private Integer counts;
}
