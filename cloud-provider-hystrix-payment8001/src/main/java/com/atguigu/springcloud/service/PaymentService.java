package com.atguigu.springcloud.service;

public interface PaymentService {
    String paymentInfo_OK(Integer Id);

    String paymentInfo_TimeOut(Integer Id);
}
