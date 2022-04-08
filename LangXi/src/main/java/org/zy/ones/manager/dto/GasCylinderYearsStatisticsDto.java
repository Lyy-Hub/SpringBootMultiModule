package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/17.
 */
@Data
public class GasCylinderYearsStatisticsDto {
    /***
     年限区间
     */
    private String yearsRange;
    /***
     数量
     */
    private Integer counts;
}
