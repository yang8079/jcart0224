package com.yh.jcartadministrationback.service.impl;

import com.yh.jcartadministrationback.dao.AddressMapper;
import com.yh.jcartadministrationback.po.Address;
import com.yh.jcartadministrationback.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 9:15
 */
@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressMapper addressMapper;

    @Override
    public Address getById(Integer addressId) {
        Address address = addressMapper.selectByPrimaryKey(addressId);
        return address;
    }
}
