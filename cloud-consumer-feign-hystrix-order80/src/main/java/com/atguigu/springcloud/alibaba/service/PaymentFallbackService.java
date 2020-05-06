package com.atguigu.springcloud.alibaba.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer Id) {
        return "paymentInfo_OK=============>PaymentFallbackService";
    }

    @Override
    public String paymentInfo_TimeOut(Integer Id) {
        return "paymentInfo_TimeOut=========>PaymentFallbackService";
    }
}
