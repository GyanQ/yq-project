package com.yq.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yq.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
