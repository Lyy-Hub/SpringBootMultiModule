package org.zy.ones.manager.controller;

import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasBeforeFillingRecCopy;
import org.zy.ones.manager.dto.GasBeforeFillingRecDto;
import org.zy.ones.manager.service.GasBeforeFillingRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 气瓶充前检查记录管理
 */
@RestController
@RequestMapping("/rest/gasBeforeFillingRec")
@Slf4j
@ResponseResult
public class GasBeforeFillingRecController {

    @Autowired
    private GasBeforeFillingRecService gasBeforeFillingRecService;

    @Autowired
    private GasBeforeFillingRecCopy gasBeforeFillingRecCopy;

    /**
     * 充前检查记录
     *
     * @param czjlId 充装记录Id
     * @return
     */
    @GetMapping("/{czjlId}")
    public List<GasBeforeFillingRecDto> getGasBeforeFillingRec(@PathVariable String czjlId) {
        return gasBeforeFillingRecCopy.toDto(gasBeforeFillingRecService.getGasBeforeFillingRec(czjlId));
    }
}
