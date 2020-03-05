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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
}
