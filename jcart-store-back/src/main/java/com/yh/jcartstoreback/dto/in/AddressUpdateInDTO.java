package com.yh.jcartstoreback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:34
 */
public class AddressUpdateInDTO {
    private String receiverName;
    private String receiverMobile;
    private String content;
    private String tag;

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

