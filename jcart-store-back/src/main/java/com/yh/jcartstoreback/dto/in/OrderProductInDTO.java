package com.yh.jcartstoreback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:38
 */
public class OrderProductInDTO {
    private Integer productId;
    private Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
