package com.yq.springcloud.service;

import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.request.PaymentRequest;
import com.yq.springcloud.utils.ResultModel;

public interface PaymentService {
    Integer add(Payment payment);

    Payment getById(Long Id);

    ResultModel update(PaymentRequest request);

    ResultModel delete(Long id);
}
