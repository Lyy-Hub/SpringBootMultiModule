package org.zy.ones.manager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasLpgTransferCopy;
import org.zy.ones.manager.dto.GasLpgTransferDto;
import org.zy.ones.manager.service.GasLpgTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 液化气瓶流转管理
 */
@RestController
@RequestMapping("/rest/gasLpgTransfer")
@Slf4j
@ResponseResult
public class GasLpgTransferController {

    @Autowired
    private GasLpgTransferService gasLpgTransferService;

    @Autowired
    private GasLpgTransferCopy gasLpgTransferCopy;

    /**
     * 流转记录
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param gpid     钢瓶 ID
     * @param lzkssj   流转开始时间
     * @param lzjssj   流转结束时间
     * @param zt       状态（重瓶/新瓶/使用中）
     * @param sfyc     是否异常(0:否 1：是)
     * @param dqwzid   当前位置
     * @return
     */
    @GetMapping("/getGasLpgTransferList")
    public Page<GasLpgTransferDto> getGasLpgTransferList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                         @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                         @RequestParam(name = "gpid", required = false) String gpid,
                                                         @RequestParam(name = "zt", required = false) String zt,
                                                         @RequestParam(name = "lzkssj", required = false) String lzkssj,
                                                         @RequestParam(name = "lzjssj", required = false) String lzjssj,
                                                         @RequestParam(name = "sfyc", required = false, defaultValue = "0") int sfyc,
                                                         @RequestParam(name = "dqwzid", required = false) String dqwzid) {
        return (Page<GasLpgTransferDto>) gasLpgTransferService.getGasLpgTransferList(pageNum, pageSize, gpid, lzkssj, lzjssj,
                zt, sfyc, dqwzid).convert(gasLpgTransferCopy::toDto);
    }
}
