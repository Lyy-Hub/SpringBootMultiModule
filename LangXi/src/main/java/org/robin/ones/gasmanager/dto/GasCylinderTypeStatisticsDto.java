package org.robin.ones.gasmanager.dto;

import lombok.Data;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Data
public class GasCylinderTypeStatisticsDto {
    /**
     * 气瓶种类：
     * 1-液化石油气钢瓶
     * 2-无缝气瓶
     * 3-溶解乙炔气瓶
     * 4-焊接气瓶
     * 5-车用气瓶
     * 6-低温绝热气瓶
     * 7-铝合金无缝气瓶
     * 8-液化二甲醚钢瓶
     * 9-液化石油气纤维缠绕气瓶
     * 10-钢制无缝气瓶
     * 11-不锈钢无缝气瓶
     * 12-钢制焊接气瓶
     * 13-工业气瓶
     */
    private Object qpzl;
    /**
     * 数量
     */
    private Integer counts;
}
