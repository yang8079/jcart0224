package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.po.Administrator;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-02 19:01
 */
public interface AdministratorService {

    Administrator getById(Integer administratorId);

    Administrator getByUsername(String username);
    //邮箱
    Administrator getByEmail(String email);

    Integer create(Administrator administrator);

    void update(Administrator administrator);

    void delete(Integer administratorId);

    void batchDelete(List<Integer> administratorIds);

    Page<Administrator> getList(Integer pageNum);
}
