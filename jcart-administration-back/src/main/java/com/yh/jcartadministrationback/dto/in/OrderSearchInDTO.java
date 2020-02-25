package com.yh.jcartadministrationback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:43
 */
public class OrderSearchInDTO {
    private Long orderId;
    private String customerName;
    private Byte status;
    private Double totalPrice;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
