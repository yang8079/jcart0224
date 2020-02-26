package com.yh.jcartstoreback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:35
 */
public class CustomerChangePwdInDTO {
    private String originPwd;
    private String newPwd;

    public String getOriginPwd() {
        return originPwd;
    }

    public void setOriginPwd(String originPwd) {
        this.originPwd = originPwd;
    }

    public String getNewPwd() {
        return newPwd;
    }

    public void setNewPwd(String newPwd) {
        this.newPwd = newPwd;
    }
}

