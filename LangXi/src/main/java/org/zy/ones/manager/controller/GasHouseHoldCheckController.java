package org.zy.ones.manager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasHouseHoldCheckCopy;
import org.zy.ones.manager.dto.GasHouseHoldCheckDto;
import org.zy.ones.manager.entity.GasPersonEntity;
import org.zy.ones.manager.service.GasHouseHoldCheckService;
import org.zy.ones.manager.service.GasPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 入户安检记录管理
 */
@RestController
@RequestMapping("/rest/gasHouseHoldCheck")
@Slf4j
@ResponseResult
public class GasHouseHoldCheckController {

    @Autowired
    private GasHouseHoldCheckService gasHouseHoldCheckService;

    @Autowired
    private GasHouseHoldCheckCopy gasHouseHoldCheckCopy;

    @Autowired
    private GasPersonService gasPersonService;

    /**
     * 入户安检查询
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param hzmc     户主名称
     * @param jckssj   检查开始时间
     * @param jcjssj   检查结束时间
     * @return
     */
    @GetMapping("/getGasLpgCustomerList")
    public Page<GasHouseHoldCheckDto> getGasHouseHoldCheckList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                               @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                               @RequestParam(name = "hzmc", required = false) String hzmc,
                                                               @RequestParam(name = "jckssj", required = false) String jckssj,
                                                               @RequestParam(name = "jcjssj", required = false) String jcjssj) {

        // 字典转义
        Page<GasHouseHoldCheckDto> page = (Page<GasHouseHoldCheckDto>) gasHouseHoldCheckService.getGasHouseHoldCheckList(pageNum, pageSize, hzmc, jckssj, jcjssj).convert(gasHouseHoldCheckCopy::toDto);
        List<GasHouseHoldCheckDto> gasHouseHoldCheckDtos = page.getRecords();
        if (gasHouseHoldCheckDtos.size() > 0) {
            // 检测人
            List<GasPersonEntity> gasPersonEntities = gasPersonService.getAll();
            gasHouseHoldCheckDtos.forEach(gasHouseHoldCheckDto -> {
                List<GasPersonEntity> gasPersonEntityList = gasPersonEntities.stream().filter(
                        a -> a.getId().equals(gasHouseHoldCheckDto.getJcr())).collect(Collectors.toList());
                if (gasPersonEntityList.size() > 0) {
                    gasHouseHoldCheckDto.setJcr(gasPersonEntityList.get(0).getXm());
                }
            });
        }
        return page;
    }
}
