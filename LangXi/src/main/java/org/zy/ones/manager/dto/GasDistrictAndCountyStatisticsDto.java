package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Data
public class GasDistrictAndCountyStatisticsDto {
    /**
     * 县区名称
     */
    private String xqName;
    /**
     * 气瓶数量
     */
    private Integer counts;
}
