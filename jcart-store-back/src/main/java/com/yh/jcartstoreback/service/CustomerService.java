package com.yh.jcartstoreback.service;

import com.yh.jcartstoreback.dto.in.CustomerRegisterInDTO;
import com.yh.jcartstoreback.po.Customer;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-29 18:09
 */
public interface CustomerService {

    Integer register(CustomerRegisterInDTO customerRegisterInDTO);

    Customer getByUsername(String username);

    Customer getById(Integer customerId);

    void update(Customer customer);

}

