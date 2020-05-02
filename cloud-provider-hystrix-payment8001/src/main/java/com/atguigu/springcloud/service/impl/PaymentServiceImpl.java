package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {
    /**
     * 正常访问，OK
     *
     * @param Id
     * @return
     */
    @Override
    public String paymentInfo_OK(Integer Id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_OK,id" + Id + "\t" + "========>";
    }

    /**
     *
     * @param Id
     * @return
     */
    @Override
    public String paymentInfo_TimeOut(Integer Id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeOut,id" + Id + "\t" + "========>" + "耗时"+timeNumber+"秒";
    }
}
