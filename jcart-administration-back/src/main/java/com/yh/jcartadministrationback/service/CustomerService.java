package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.po.Customer;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 20:53
 */
public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);
}
