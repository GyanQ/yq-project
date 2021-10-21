package com.yq.springcloud.service;

import com.yq.springcloud.entity.Payment;

public interface PaymentService {
    Integer add(Payment payment);

    Payment getById(Long Id);
}
