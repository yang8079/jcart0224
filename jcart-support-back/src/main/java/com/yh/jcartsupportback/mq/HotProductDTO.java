package com.yh.jcartsupportback.mq;

import java.io.Serializable;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-24 11:09
 */
public class HotProductDTO implements Serializable {
    private Integer productId;
    private String productCode;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}