package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/17.
 */
@Data
public class GasRealTimeStatisticsDto {
    /**
     * 日期
     */
    private String data;
    /**
     * 数量
     */
    private Integer counts;
}
