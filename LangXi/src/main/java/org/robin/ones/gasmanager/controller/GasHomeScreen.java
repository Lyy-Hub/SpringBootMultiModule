package org.robin.ones.gasmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.robin.ones.gasmanager.common.ResponseResult;
import org.robin.ones.gasmanager.copy.GasFillingRecordCopy;
import org.robin.ones.gasmanager.dto.*;
import org.robin.ones.gasmanager.service.GasDataStatisticsService;
import org.robin.ones.gasmanager.service.GasFillingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 首页大屏数据统计
 */
@RestController
@RequestMapping("/rest/home")
@Slf4j
@ResponseResult
public class GasHomeScreen {

    @Autowired
    private GasDataStatisticsService gasDataStatisticsService;

    @Autowired
    private GasFillingRecordService gasFillingRecordService;

    @Autowired
    private GasFillingRecordCopy gasFillingRecordCopy;

    /**
     * 统计数据
     */
    @GetMapping("/getDataStatistics")
    public List<GasDataStatisticsDto> getDataStatistics() {
        return gasDataStatisticsService.getDataStatistics();
    }

    /**
     * 区县统计 - 气瓶数
     */
    @GetMapping("/getDistrictAndCountyStatistics")
    public List<GasDistrictAndCountyStatisticsDto> getDistrictAndCountyStatistics() {
        return gasDataStatisticsService.getDistrictAndCountyStatistics();
    }

    /**
     * 气瓶种类统计
     */
    @GetMapping("/getCylinderTypeStatistics")
    public List<GasCylinderTypeStatisticsDto> getCylinderTypeStatistics() {
        return gasDataStatisticsService.getCylinderTypeStatistics();
    }

    /**
     * 地图标注 - 气站数
     */
    @GetMapping("/getMapMarkStatistics")
    public List<GasMapMarkStatisticsDto> getMapMarkStatistics() {
        return gasDataStatisticsService.getMapMarkStatistics();
    }

    /**
     * 充装记录 - 前20条
     */
    @GetMapping("/getFillingRecordStatistics")
    public List<GasFillingRecordDto> getFillingRecordStatistics() {
        return gasFillingRecordCopy.toDto(gasFillingRecordService.getFillingRecordStatistics());
    }

    /**
     * 实时数据统计 - 当月每天充装数
     */
    @GetMapping("/getRealTimeStatistics")
    public List<GasRealTimeStatisticsDto> getRealTimeStatistics() {
        return gasDataStatisticsService.getRealTimeStatistics();
    }

    /**
     * 充装次数统计
     */
    @GetMapping("/getFillingCountStatistics")
    public List<GasFillingCountStatisticsDto> getFillingCountStatistics() {
        return gasDataStatisticsService.getFillingCountStatistics();
    }

    /**
     * 气瓶年限统计
     */
    @GetMapping("/getCylinderYearsStatistics")
    public Map<String, Integer> getCylinderYearsStatistics() {
        return gasDataStatisticsService.getCylinderYearsStatistics();
    }
}
