package org.robin.ones.gasmanager.service;

import org.robin.ones.gasmanager.dto.*;

import java.util.List;
import java.util.Map;

/**
 * Created by liYueYang on 2022/1/14.
 */
public interface GasDataStatisticsService {
    List<GasDataStatisticsDto> getDataStatistics();

    List<GasDistrictAndCountyStatisticsDto> getDistrictAndCountyStatistics();

    List<GasCylinderTypeStatisticsDto> getCylinderTypeStatistics();

    List<GasMapMarkStatisticsDto> getMapMarkStatistics();

    List<GasRealTimeStatisticsDto> getRealTimeStatistics();

    List<GasFillingCountStatisticsDto> getFillingCountStatistics();

    Map<String, Integer> getCylinderYearsStatistics();
}
