package com.yh.jcartadministrationback.service;

import com.yh.jcartadministrationback.po.Administrator;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-02 19:01
 */
public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);

    void update(Administrator administrator);
}
