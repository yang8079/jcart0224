package com.yh.jcartstoreback.service;

import com.yh.jcartstoreback.po.Address;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 9:54
 */
public interface AddressService {

    Address getById(Integer addressId);

    List<Address> getByCustomerId(Integer customerId);

    Integer create(Address address);

    void update(Address address);

    void delete(Integer addressId);

}
