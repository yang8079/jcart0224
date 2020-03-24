package com.yh.jcartstoreback.po;

import java.util.Date;

public class ProductOperation {
    private Integer productId;

    private Integer dayCount;

    private Date recentTime;

    private Integer addCount;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getDayCount() {
        return dayCount;
    }

    public void setDayCount(Integer dayCount) {
        this.dayCount = dayCount;
    }

    public Date getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Date recentTime) {
        this.recentTime = recentTime;
    }

    public Integer getAddCount() {
        return addCount;
    }

    public void setAddCount(Integer addCount) {
        this.addCount = addCount;
    }
}