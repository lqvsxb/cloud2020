package com.atguigu.springcloud.alibaba.service;

public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentInfo_TimeOutHandler(Integer id);

    String paymentCircuitBreaker(Integer id);

    String paymentCircuitBreaker_fallback(Integer id);
}
