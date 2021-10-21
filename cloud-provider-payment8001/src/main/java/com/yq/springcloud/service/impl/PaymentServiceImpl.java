package com.yq.springcloud.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.mapper.PaymentMapper;
import com.yq.springcloud.request.PaymentRequest;
import com.yq.springcloud.service.PaymentService;
import com.yq.springcloud.utils.ResultModel;
import com.yq.springcloud.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 支付模块实现类
 * @author: Gyan
 * @create: 2021-10-19
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public Integer add(Payment payment) {
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment getById(Long Id) {
        return paymentMapper.selectOne(
                new QueryWrapper<Payment>().eq("id", Id));
    }

    @Override
    public ResultModel update(PaymentRequest request) {
        Payment payment = new Payment();
        payment.setId(request.getId());
        payment.setSerial(request.getSerial());
        paymentMapper.updateById(payment);
        return ResultUtil.success();
    }

    @Override
    public ResultModel delete(Long id) {
        paymentMapper.delete(new QueryWrapper<Payment>()
                .eq("id", id));
        return ResultUtil.success();
    }
}
