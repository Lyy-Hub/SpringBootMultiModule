package org.robin.ones.gasmanager.controller;

import lombok.extern.slf4j.Slf4j;
import org.robin.ones.gasmanager.common.ResponseResult;
import org.robin.ones.gasmanager.copy.GasAfterFillingRecCopy;
import org.robin.ones.gasmanager.dto.GasAfterFillingRecDto;
import org.robin.ones.gasmanager.service.GasAfterFillingRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 气瓶充后检查记录管理
 */
@RestController
@RequestMapping("/rest/gasAfterFillingRec")
@Slf4j
@ResponseResult
public class GasAfterFillingRecController {

    @Autowired
    private GasAfterFillingRecService gasAfterFillingRecService;

    @Autowired
    private GasAfterFillingRecCopy gasAfterFillingRecCopy;

    /**
     * 充后检查记录
     *
     * @param czjlId 充装记录Id
     * @return
     */
    @GetMapping("/{czjlId}")
    public List<GasAfterFillingRecDto> getGasAfterFillingRec(@PathVariable String czjlId) {
        return gasAfterFillingRecCopy.toDto(gasAfterFillingRecService.getGasAfterFillingRec(czjlId));
    }
}
