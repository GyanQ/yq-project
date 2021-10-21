package com.yq.springcloud.openfeign.payment8001;

import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.utils.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description: OpenFeignService
 * @author: Gyan
 * @create: 2021-10-20
 **/
@FeignClient(name = "cloud-payment-service")
public interface PaymentFeign {

    @GetMapping("/payment/getById/{id}")
    ResultModel<Payment> getById(@PathVariable("id") Long id);
}
