package org.robin.ones.gasmanager.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.robin.ones.gasmanager.common.ResponseResult;
import org.robin.ones.gasmanager.copy.GasLpgCustomerCopy;
import org.robin.ones.gasmanager.dto.GasLpgCustomerDto;
import org.robin.ones.gasmanager.service.GasLpgCustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 液化气瓶用户管理
 */
@RestController
@RequestMapping("/rest/gasLpgCustomer")
@Slf4j
@ResponseResult
public class GasLpgCustomerController {

    @Autowired
    private GasLpgCustomerService gasLpgCustomerService;

    @Autowired
    private GasLpgCustomerCopy gasLpgCustomerCopy;

    /**
     * 用户查询
     *
     * @param pageNum  页码
     * @param pageSize 每页条数
     * @param xm       姓名
     * @param lxdh     联系电话
     * @return
     */
    @GetMapping("/getGasLpgCustomerList")
    public Page<GasLpgCustomerDto> getGasLpgCustomerList(@RequestParam(name = "pageNum", required = false, defaultValue = "1") int pageNum,
                                                         @RequestParam(name = "pageSize", required = false, defaultValue = "20") int pageSize,
                                                         @RequestParam(name = "xm", required = false) String xm,
                                                         @RequestParam(name = "lxdh", required = false) String lxdh) {
        return (Page<GasLpgCustomerDto>) gasLpgCustomerService.getGasLpgCustomerList(pageNum, pageSize, xm, lxdh).convert(gasLpgCustomerCopy::toDto);
    }
}
