package com.yh.jcartstoreback.dto.out;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:39
 */
public class OrderHistoryListOutDTO {
    private Long timestamp;
    private Byte orderStatus;
    private String comment;

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

