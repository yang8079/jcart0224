package com.yh.jcartadministrationback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 10:24
 */
public class CustomerSetStatusInDTO {

    private  Integer customerId;
    private  Byte status;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
