package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.StorageMapper;
import com.atguigu.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger logger = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     * @param productId 商品id
     * @param count 商品数量
     */
    @Override
    public void decrease(Long productId, Integer count) {
        logger.info("------->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        logger.info("------->storage-service中扣减库存结束");
    }
}
