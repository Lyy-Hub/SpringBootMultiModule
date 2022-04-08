package org.zy.ones.manager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Data
public class GasDataStatisticsDto {
    /***
     分类名称
     */
    private String typeName;
    /***
     数量
     */
    private Integer counts;
}
