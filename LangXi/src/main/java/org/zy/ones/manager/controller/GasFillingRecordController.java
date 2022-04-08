package org.zy.ones.manager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasFillingRecordCopy;
import org.zy.ones.manager.dto.GasFillingRecordDto;
import org.zy.ones.manager.entity.GasPersonEntity;
import org.zy.ones.manager.entity.GasStationEntity;
import org.zy.ones.manager.service.GasFillingRecordService;
import org.zy.ones.manager.service.GasPersonService;
import org.zy.ones.manager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 气瓶充装记录管理
 */
@RestController
@RequestMapping("/rest/gasFillingRecord")
@Slf4j
@ResponseResult
public class GasFillingRecordController {

    @Autowired
    private GasFillingRecordService gasFillingRecordService;

    @Autowired
    private GasFillingRecordCopy gasFillingRecordCopy;

    @Autowired
    private GasPersonService gasPersonService;

    @Autowired
    private GasStationService gasStationService;

    /**
     * 充装记录
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param gpid     钢瓶 ID
     * @param czdw     充装单位
     * @param czkssj   充装开始时间
     * @param czjssj   充装结束时间
     * @param czjz     充装介质
     * @param czy      充装员
     * @param jcy      检查员
     * @return
     */
    @GetMapping("/getGasFillingRecordList")
    public Page<GasFillingRecordDto> getGasFillingRecordList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                             @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                             @RequestParam(name = "gpid", required = false) String gpid,
                                                             @RequestParam(name = "czdw", required = false) String czdw,
                                                             @RequestParam(name = "czkssj", required = false) String czkssj,
                                                             @RequestParam(name = "czjssj", required = false) String czjssj,
                                                             @RequestParam(name = "czjz", required = false) String czjz,
                                                             @RequestParam(name = "czy", required = false) String czy,
                                                             @RequestParam(name = "jcy", required = false) String jcy) {
        Page<GasFillingRecordDto> page = (Page<GasFillingRecordDto>) gasFillingRecordService.getGasFillingRecordList(pageNum, pageSize, gpid, czdw, czkssj,
                czjssj, czjz, czy, jcy).convert(gasFillingRecordCopy::toDto);
        List<GasFillingRecordDto> gasFillingRecordDtos = page.getRecords();
        // 字典转义
        if (gasFillingRecordDtos.size() > 0) {
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            List<GasPersonEntity> gasPersonEntities = gasPersonService.getAll();
            gasFillingRecordDtos.forEach(gasFillingRecordDto -> {
                // 充装单位
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordDto.getCzdw())).collect(Collectors.toList());
                if (gasStationEntityList.size() > 0) {
                    String zdmc = "";
                    if (gasStationEntityList.get(0).getBz() == null || gasStationEntityList.get(0).getBz().equals("")) {
                        zdmc = gasStationEntityList.get(0).getZdmc();
                    } else {
                        zdmc = gasStationEntityList.get(0).getBz();
                    }
                    gasFillingRecordDto.setCzdw(zdmc);
                }
                // 充装员
                List<GasPersonEntity> gasPersonEntityList = gasPersonEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordDto.getCzy())).collect(Collectors.toList());
                if (gasPersonEntityList.size() > 0) {
                    gasFillingRecordDto.setCzy(gasPersonEntityList.get(0).getXm());
                }
                // 检查员
                List<GasPersonEntity> gasPersonEntityList1 = gasPersonEntities.stream().filter(
                        a -> a.getId().equals(gasFillingRecordDto.getJcy())).collect(Collectors.toList());
                if (gasPersonEntityList1.size() > 0) {
                    gasFillingRecordDto.setJcy(gasPersonEntityList1.get(0).getXm());
                }
            });
        }
        return page;
    }

}
