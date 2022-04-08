package org.zy.ones.manager.dto;

import lombok.Data;

import java.util.List;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Data
public class GasFillingCountStatisticsDto {

    /**
     * 设备总数
     */
    private Integer deviceTotal;
    /**
     * 单位充装次数
     */
    private List<GasStatisticsCommonDto> dwczcs;
}
