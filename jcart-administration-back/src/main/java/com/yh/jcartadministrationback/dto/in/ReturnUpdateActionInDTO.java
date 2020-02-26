package com.yh.jcartadministrationback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:56
 */
public class ReturnUpdateActionInDTO {
    private Integer returnId;
    private Byte action;

    public Integer getReturnId() {
        return returnId;
    }

    public void setReturnId(Integer returnId) {
        this.returnId = returnId;
    }

    public Byte getAction() {
        return action;
    }

    public void setAction(Byte action) {
        this.action = action;
    }
}

