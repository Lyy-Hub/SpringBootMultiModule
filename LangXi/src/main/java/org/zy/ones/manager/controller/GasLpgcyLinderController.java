package org.zy.ones.manager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.ResponseResult;
import org.zy.ones.manager.copy.GasLpgcyLinderCopy;
import org.zy.ones.manager.dto.GasLpgcyLinderDto;
import org.zy.ones.manager.service.GasLpgcyLinderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 液化气瓶基础信息管理
 */
@RestController
@RequestMapping("/rest/gasLpgcyLinder")
@Slf4j
@ResponseResult
public class GasLpgcyLinderController {

    @Autowired
    private GasLpgcyLinderService gasLpgcyLinderService;

    @Autowired
    private GasLpgcyLinderCopy gasLpgcyLinderCopy;


    /**
     * 气瓶查询
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param gpbm     钢瓶编码
     * @param gpgg     钢瓶规格
     * @param ssdwid   所属单位 ID
     * @param sccj     生产厂家
     * @param bcjyksrq   本次检验开始日期
     * @param bcjyjsrq   本次检验结束日期
     * @param zzsykssj   终止使用开始时间
     * @param zzsyjssj   终止使用结束时间
     * @param jydw     检验单位
     * @param qpzl     气瓶种类
     * @param qpzt     气瓶状态
     * @return
     */
    @GetMapping("/getGasLpgcyLinderList")
    public Page<GasLpgcyLinderDto> getGasLpgcyLinderList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                         @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                         @RequestParam(name = "gpbm", required = false) String gpbm,
                                                         @RequestParam(name = "gpgg", required = false) String gpgg,
                                                         @RequestParam(name = "ssdwid", required = false) String ssdwid,
                                                         @RequestParam(name = "sccj", required = false) String sccj,
                                                         @RequestParam(name = "bcjyksrq", required = false) String bcjyksrq,
                                                         @RequestParam(name = "bcjyjsrq", required = false) String bcjyjsrq,
                                                         @RequestParam(name = "zzsykssj", required = false) String zzsykssj,
                                                         @RequestParam(name = "zzsyjssj", required = false) String zzsyjssj,
                                                         @RequestParam(name = "jydw", required = false) String jydw,
                                                         @RequestParam(name = "qpzl", required = false) String qpzl,
                                                         @RequestParam(name = "qpzt", required = false) String qpzt) {
        return (Page<GasLpgcyLinderDto>) gasLpgcyLinderService.getGasLpgcyLinderList(pageNum, pageSize, gpbm, gpgg, ssdwid, sccj,
                bcjyksrq, bcjyjsrq, zzsykssj, zzsyjssj, jydw, qpzl, qpzt).convert(gasLpgcyLinderCopy::toDto);
    }
}
