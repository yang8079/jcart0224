package com.yh.jcartstoreback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:36
 */
public class CustomerUpdateProfileInDTO {
    private String realName;
    private String mobile;
    private String email;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

