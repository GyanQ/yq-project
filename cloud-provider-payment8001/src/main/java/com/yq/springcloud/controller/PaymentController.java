package com.yq.springcloud.controller;

import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.request.PaymentRequest;
import com.yq.springcloud.service.PaymentService;
import com.yq.springcloud.utils.ResultModel;
import com.yq.springcloud.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 支付模块
 * @author: Gyan
 * @create: 2021-10-19
 **/
@RestController
@Api(tags = {"用户管理"}, description = "用户管理")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/add")
    @ApiOperation("新增")
    public ResultModel<Integer> add(@RequestBody Payment payment) {
        return ResultUtil.success(paymentService.add(payment));
    }

    @GetMapping("/payment/getById/{id}")
    @ApiOperation("根据id查询")
    public ResultModel<Payment> getById(@PathVariable("id") Long id) {
        return ResultUtil.success(paymentService.getById(id));
    }

    @PostMapping("/payment/update")
    @ApiOperation("修改")
    public ResultModel update(@RequestBody PaymentRequest request) {
        return ResultUtil.success(paymentService.update(request));
    }

    @DeleteMapping("/payment/delete")
    @ApiOperation("删除")
    public ResultModel delete(@RequestParam Long id) {
        return ResultUtil.success(paymentService.delete(id));
    }
}
