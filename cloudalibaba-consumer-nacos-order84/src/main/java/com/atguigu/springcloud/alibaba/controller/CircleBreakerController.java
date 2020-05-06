package com.atguigu.springcloud.alibaba.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class CircleBreakerController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @RequestMapping("/consumer/fallback/{id}")
    public CommonResult<Payment> fallback(@PathVariable("id") long id) {
        CommonResult<Payment> result = restTemplate.getForObject(serviceURL + "/paymentSQL/" + id, CommonResult.class, id);
        return null;
    }
}
