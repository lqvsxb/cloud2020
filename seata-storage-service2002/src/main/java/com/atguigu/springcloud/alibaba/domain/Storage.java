package com.atguigu.springcloud.alibaba.domain;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 库存
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage implements Serializable {
    private Long id;

    /**
    * 产品id
    */
    private Long productId;

    /**
    * 总库存
    */
    private Integer total;

    /**
    * 已用库存
    */
    private Integer used;

    /**
    * 剩余库存
    */
    private Integer residue;

    private static final long serialVersionUID = 1L;
}