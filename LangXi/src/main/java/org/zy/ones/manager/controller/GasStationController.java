package org.zy.ones.manager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasStationCopy;
import org.zy.ones.manager.dto.GasStationDto;
import org.zy.ones.manager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 充装单位信息管理
 */
@RestController
@RequestMapping("/rest/gasStation")
@Slf4j
@ResponseResult
public class GasStationController {

    @Autowired
    private GasStationService gasStationService;

    @Autowired
    private GasStationCopy gasStationCopy;

    /**
     * 气站查询
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param zdmc     站点名称/站点别名（用一个参数）
     * @param lxr      联系人
     * @param szdq     所在地区
     * @return
     */
    @GetMapping("/getGasStationList")
    public Page<GasStationDto> getGasStationList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                 @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                 @RequestParam(name = "zdmc", required = false) String zdmc,
                                                 @RequestParam(name = "lxr", required = false) String lxr,
                                                 @RequestParam(name = "szdq", required = false) String szdq) {
        return (Page<GasStationDto>) gasStationService.getGasStationList(pageNum, pageSize, zdmc, lxr, szdq).convert(gasStationCopy::toDto);
    }
}
