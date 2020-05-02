package com.atguigu.springcloud.service;

public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentInfo_TimeOutHandler(Integer id);
}
