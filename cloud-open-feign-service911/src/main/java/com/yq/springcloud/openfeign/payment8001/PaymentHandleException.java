package com.yq.springcloud.openfeign.payment8001;

import com.yq.springcloud.entity.Payment;
import com.yq.springcloud.utils.ResultModel;
import com.yq.springcloud.utils.ResultUtil;

/**
 * @description: 处理payment降级异常
 * @author: Gyan
 * @create: 2021-10-21
 **/
public class PaymentHandleException implements PaymentFeign {
    @Override
    public ResultModel<Payment> getById(Long id) {
        return ResultUtil.failure("异常处理");
    }
}
