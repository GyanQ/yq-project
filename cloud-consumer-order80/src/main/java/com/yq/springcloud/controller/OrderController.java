package com.yq.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.openfeign.payment8001.PaymentFeign;
import com.yq.springcloud.utils.ResultModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 消费者80
 * @author: Gyan
 * @create: 2021-10-20
 **/
@RestController
@Api(tags = {"消费者80"}, description = "消费者80")
//@DefaultProperties(defaultFallback = "GlobalDowngrade")  //配置全局降级
public class OrderController {

    private final static String PAYMENT_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private PaymentFeign paymentFeign;

    @GetMapping("/consumer/payment/getById/{id}")
    @ApiOperation("查询")
    //@HystrixCommand
    public ResultModel<Payment> getPaymentById(@PathVariable("id") Long id) {
        //return restTemplate.getForObject(PAYMENT_URL + "/payment/getById/" + id, ResultModel.class, id);
        return paymentFeign.getById(id);
    }

    /*@PostMapping("/consumer/payment/add")
    @ApiOperation("新增")
    //@HystrixCommand
    public ResultModel<Payment> add(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add", payment, ResultModel.class);
    }*/

    public String GlobalDowngrade() {
        return "系统繁忙";
    }
}
