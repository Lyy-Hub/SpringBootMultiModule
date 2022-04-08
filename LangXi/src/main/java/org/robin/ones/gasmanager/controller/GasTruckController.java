package org.robin.ones.gasmanager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.robin.ones.gasmanager.common.ResponseResult;
import org.robin.ones.gasmanager.copy.GasTruckCopy;
import org.robin.ones.gasmanager.dto.GasTruckDto;
import org.robin.ones.gasmanager.entity.GasStationEntity;
import org.robin.ones.gasmanager.service.GasStationService;
import org.robin.ones.gasmanager.service.GasTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 配送车辆信息管理
 */
@RestController
@RequestMapping("/rest/gasTruck")
@Slf4j
@ResponseResult
public class GasTruckController {
    @Autowired
    private GasTruckService gasTruckService;

    @Autowired
    private GasTruckCopy gasTruckCopy;

    @Autowired
    private GasStationService gasStationService;

    /**
     * 车辆查询
     *
     * @param pageNum   页码
     * @param pageSize  每页条数
     * @param cph       车牌号
     * @param ssdwid    所属单位 ID
     * @param fzr       负责人
     * @param szdq      所在地区
     * @param ywzdqkssj 运危证到期开始时间
     * @param ywzdqjssj 运危证到期结束时间
     * @return
     */
    @GetMapping("/getGasTruckList")
    public Page<GasTruckDto> getGasTruckList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                             @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                             @RequestParam(name = "cph", required = false) String cph,
                                             @RequestParam(name = "ssdwid", required = false) String ssdwid,
                                             @RequestParam(name = "fzr", required = false) String fzr,
                                             @RequestParam(name = "szdq", required = false) String szdq,
                                             @RequestParam(name = "ywzdqkssj", required = false) String ywzdqkssj,
                                             @RequestParam(name = "ywzdqjssj", required = false) String ywzdqjssj) {

        Page<GasTruckDto> page = (Page<GasTruckDto>) gasTruckService.getGasStationList(pageNum, pageSize, cph,
                ssdwid, fzr, szdq, ywzdqkssj, ywzdqjssj).convert(gasTruckCopy::toDto);
        List<GasTruckDto> gasTruckDtoList = page.getRecords();
        // 字典转义
        if (gasTruckDtoList.size() > 0) {
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            gasTruckDtoList.forEach(gasTruckDto -> {
                // 充装单位
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasTruckDto.getSsdwid())).collect(Collectors.toList());
                if (gasStationEntityList.size() > 0) {
                    String zdmc = "";
                    if (gasStationEntityList.get(0).getBz() == null || gasStationEntityList.get(0).getBz().equals("")) {
                        zdmc = gasStationEntityList.get(0).getZdmc();
                    } else {
                        zdmc = gasStationEntityList.get(0).getBz();
                    }
                    gasTruckDto.setSsdwid(zdmc);
                }
            });
        }
        return page;
    }
}
