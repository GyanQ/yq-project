package com.yq.springcloud.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: payment-update-request
 * @author: Gyan
 * @create: 2021-10-21
 **/
@Data
public class PaymentRequest implements Serializable {
    private static final long serialVersionUID = -7071587059756500896L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "serial")
    private String serial;
}
