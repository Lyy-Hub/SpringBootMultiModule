package org.robin.ones.gasmanager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.robin.ones.gasmanager.common.ResponseResult;
import org.robin.ones.gasmanager.copy.GasPersonCopy;
import org.robin.ones.gasmanager.dto.GasPersonDto;
import org.robin.ones.gasmanager.entity.GasStationEntity;
import org.robin.ones.gasmanager.service.GasPersonService;
import org.robin.ones.gasmanager.service.GasStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 从业人员信息管理
 */
@RestController
@RequestMapping("/rest/gasPerson")
@Slf4j
@ResponseResult
public class GasPersonController {
    @Autowired
    private GasPersonService gasPersonService;

    @Autowired
    private GasPersonCopy gasPersonCopy;

    @Autowired
    private GasStationService gasStationService;

    /**
     * 人员查询
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param xm       姓名
     * @param js       角色
     * @param sfzhm    身份证号码
     * @param zjbh     证件编号
     * @param szdwid   所在单位 ID
     * @return
     */
    @GetMapping("/getGasPersonList")
    public Page<GasPersonDto> getGasPersonList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                               @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                               @RequestParam(name = "xm", required = false) String xm,
                                               @RequestParam(name = "js", required = false) String js,
                                               @RequestParam(name = "sfzhm", required = false) String sfzhm,
                                               @RequestParam(name = "zjbh", required = false) String zjbh,
                                               @RequestParam(name = "szdwid", required = false) String szdwid) {
        Page<GasPersonDto> page = (Page<GasPersonDto>) gasPersonService.getGasPersonList(pageNum, pageSize, xm,
                js, sfzhm, zjbh, szdwid).convert(gasPersonCopy::toDto);
        List<GasPersonDto> gasPersonDtos = page.getRecords();
        // 字典转义
        if (gasPersonDtos.size() > 0) {
            List<GasStationEntity> gasStationEntities = gasStationService.getAll();
            gasPersonDtos.forEach(gasPersonDto -> {
                // 充装单位
                List<GasStationEntity> gasStationEntityList = gasStationEntities.stream().filter(
                        a -> a.getId().equals(gasPersonDto.getSzdwid())).collect(Collectors.toList());
                if (gasStationEntityList.size() > 0) {
                    String zdmc = "";
                    if (gasStationEntityList.get(0).getBz() == null || gasStationEntityList.get(0).getBz().equals("")) {
                        zdmc = gasStationEntityList.get(0).getZdmc();
                    } else {
                        zdmc = gasStationEntityList.get(0).getBz();
                    }
                    gasPersonDto.setSzdwid(zdmc);
                }
            });
        }
        return page;
    }
}
