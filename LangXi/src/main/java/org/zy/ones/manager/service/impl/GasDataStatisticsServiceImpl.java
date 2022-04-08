package org.zy.ones.manager.service.impl;

import org.zy.ones.manager.dto.*;
import org.zy.ones.manager.entity.GasLpgcyLinderEntity;
import org.zy.ones.manager.entity.GasStationEntity;
import org.zy.ones.manager.mapper.GasDataStatisticsMapper;
import org.zy.ones.manager.mapper.GasLpgcyLinderMapper;
import org.zy.ones.manager.service.GasDataStatisticsService;
import org.zy.ones.manager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static com.zy.ones.common.util.DateUtils.getYearMonth;
import static com.zy.ones.common.util.DateUtils.getYearRange;

/**
 * Created by liYueYang on 2022/1/14.
 */
@Service
public class GasDataStatisticsServiceImpl implements GasDataStatisticsService {

    @Autowired
    private GasDataStatisticsMapper gasDataStatisticsMapper;

    @Autowired
    private GasStationService gasStationService;

    @Autowired
    private GasLpgcyLinderMapper gasLpgcyLinderMapper;

    /**
     * 统计数据
     * 不同类型（供应站、配送车辆、从业人员、气瓶）的数量统计
     *
     * @return
     */
    @Override
    public List<GasDataStatisticsDto> getDataStatistics() {
        return gasDataStatisticsMapper.getDataStatistics();
    }

    /**
     * 区县统计
     * 每个县区气瓶数
     *
     * @return
     */
    @Override
    public List<GasDistrictAndCountyStatisticsDto> getDistrictAndCountyStatistics() {
        List<GasDistrictAndCountyStatisticsDto> gdacsList = gasDataStatisticsMapper.getDistrictAndCountyStatistics();
        // 关联站点表字典转义
        if (gdacsList.size() > 0) {
            List<GasDistrictAndCountyStatisticsDto> gdacsList2 = new ArrayList<>();
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            gdacsList.forEach(gasdacStatisticsDto -> {
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().substring(0, 6).equals(gasdacStatisticsDto.getXqName())).collect(Collectors.toList());
                gasdacStatisticsDto.setXqName(gasStationEntityList.size() > 0 ? gasStationEntityList.get(0).getSzdq() : gasdacStatisticsDto.getXqName());
            });

            // 县区名称一样的，数量叠加到一起
            gdacsList.forEach(gasdacStatisticsDto -> {
                List<GasDistrictAndCountyStatisticsDto> gasDistrictAndCountyStatisticsDtos = gdacsList2.stream().filter(a -> a.getXqName().equals(gasdacStatisticsDto.getXqName())).collect(Collectors.toList());
                if (gasDistrictAndCountyStatisticsDtos.size() == 0) {
                    gdacsList2.add(gasdacStatisticsDto);
                } else {
                    int result = gasDistrictAndCountyStatisticsDtos.get(0).getCounts() + gasdacStatisticsDto.getCounts();
                    gasDistrictAndCountyStatisticsDtos.get(0).setCounts(result);
                }
            });
            return gdacsList2;
        }
        return gdacsList;
    }

    /**
     * 气瓶种类
     * 不同种类气瓶的数量
     *
     * @return
     */
    @Override
    public List<GasCylinderTypeStatisticsDto> getCylinderTypeStatistics() {
        List<GasCylinderTypeStatisticsDto> gasCylinderTypeStatisticsDtos = gasDataStatisticsMapper.getCylinderTypeStatistics();
        gasCylinderTypeStatisticsDtos.forEach(gasCylinderTypeStatisticsDto -> {
            if (gasCylinderTypeStatisticsDto.getQpzl() == null) {
                gasCylinderTypeStatisticsDto.setQpzl("无");
            }
        });
        return gasCylinderTypeStatisticsDtos;
    }

    /**
     * 地图标注
     * 每个区县的气站数
     *
     * @return
     */
    @Override
    public List<GasMapMarkStatisticsDto> getMapMarkStatistics() {
        return gasDataStatisticsMapper.getMapMarkStatistics();
    }

    /**
     * 实时数据
     * 统计当月每天的充装次数
     *
     * @return
     */
    @Override
    public List<GasRealTimeStatisticsDto> getRealTimeStatistics() {
        return gasDataStatisticsMapper.getRealTimeStatistics(getYearMonth());
    }

    /**
     * 充装次数统计
     * 每个站点充装次数
     *
     * @return
     */
    @Override
    public List<GasFillingCountStatisticsDto> getFillingCountStatistics() {
        List<GasFillingCountStatisticsDto> gasFillingCountStatisticsDtos = new ArrayList<>();
        GasFillingCountStatisticsDto fillingCountStatisticsDto = new GasFillingCountStatisticsDto();
        fillingCountStatisticsDto.setDeviceTotal(gasStationService.getCount());
        List<GasStatisticsCommonDto> gasStatisticsCommonDtos = gasDataStatisticsMapper.getFillingCountStatistics();
        if (gasStatisticsCommonDtos.size() > 0) {
            List<GasStatisticsCommonDto> gasStatisticsCommonDtoList = new ArrayList<>();
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            gasStatisticsCommonDtos.forEach(gasStatisticsCommonDto -> {
                // 查询站点表，根据dwName对应站点表里的id，取出bz作为这个dwName
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasStatisticsCommonDto.getDwName())).collect(Collectors.toList());
                gasStatisticsCommonDto.setDwName(gasStationEntityList.size() > 0 ? gasStationEntityList.get(0).getBz() : gasStatisticsCommonDto.getDwName());
            });
            // dwName一样的，数量叠加到一起
            gasStatisticsCommonDtos.forEach(gasdacStatisticsDto -> {
                List<GasStatisticsCommonDto> gasDistrictAndCountyStatisticsDtos = gasStatisticsCommonDtoList.stream().filter(a -> a.getDwName().equals(gasdacStatisticsDto.getDwName())).collect(Collectors.toList());
                if (gasDistrictAndCountyStatisticsDtos.size() == 0) {
                    gasStatisticsCommonDtoList.add(gasdacStatisticsDto);
                } else {
                    int result = gasDistrictAndCountyStatisticsDtos.get(0).getCounts() + gasdacStatisticsDto.getCounts();
                    gasDistrictAndCountyStatisticsDtos.get(0).setCounts(result);
                }
            });
            fillingCountStatisticsDto.setDwczcs(gasStatisticsCommonDtoList);
            gasFillingCountStatisticsDtos.add(fillingCountStatisticsDto);
            return gasFillingCountStatisticsDtos;
        }
        return gasFillingCountStatisticsDtos;
    }

    /**
     * 气瓶年限统计
     *
     * @return
     */
    @Override
    public Map<String, Integer> getCylinderYearsStatistics() {
        List<GasLpgcyLinderEntity> gasLpgcyLinderEntities = gasLpgcyLinderMapper.selectAll();
        Map<String, Integer> map = new HashMap<>();
        int one = 0;// 气瓶年限0-4年
        int two = 0;// 气瓶年限4-8年
        int three = 0;// 气瓶年限8年以上
        int four = 0;// 数据不全
        if (gasLpgcyLinderEntities.size() > 0) {
            List<GasLpgcyLinderEntity> lpgcyLinderEntities = gasLpgcyLinderEntities.stream().filter(
                    a -> a.getScrq() != null && a.getBcjyrq() != null).collect(Collectors.toList());
            four = gasLpgcyLinderEntities.size() - lpgcyLinderEntities.size();
            for (int i = 0; i < lpgcyLinderEntities.size(); i++) {
                Date scrq = lpgcyLinderEntities.get(i).getScrq();
                Date bcjyrq = lpgcyLinderEntities.get(i).getBcjyrq();
                int betweenYear = getYearRange(scrq, bcjyrq);
                if ((0 <= betweenYear) && (betweenYear <= 4)) {
                    one++;
                } else if ((4 < betweenYear) && (betweenYear <= 8)) {
                    two++;
                } else if (8 < betweenYear) {
                    three++;
                } else {
                    four++;
                }
            }
        }
        map.put("气瓶年限0-4年", one);
        map.put("气瓶年限4-8年", two);
        map.put("气瓶年限8年以上", three);
        map.put("数据不全", four);
        return map;
    }
}
