package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.CustomerSetStatusInDTO;
import com.yh.jcartadministrationback.po.Customer;
import org.springframework.cglib.core.TinyBitSet;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 20:53
 */
public interface CustomerService {
    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
