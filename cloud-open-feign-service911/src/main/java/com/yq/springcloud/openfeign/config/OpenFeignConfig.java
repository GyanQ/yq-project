package com.yq.springcloud.openfeign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @description: OpenFeign配置类
 * @author: Gyan
 * @create: 2021-10-20
 **/
@Configuration
public class OpenFeignConfig {
    /**
     * feignClient日志级别配置
     *
     * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
