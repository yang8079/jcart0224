package com.yh.jcartadministrationback.service;

import com.yh.jcartadministrationback.po.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 9:15
 */
public interface AddressService {

    Address getById(Integer addressId);

    //列表
    List<Address> getByCustomerId( Integer customerId);
}
