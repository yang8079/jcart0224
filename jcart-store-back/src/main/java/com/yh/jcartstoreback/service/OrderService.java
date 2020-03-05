package com.yh.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.yh.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.yh.jcartstoreback.dto.out.OrderShowOutDTO;
import com.yh.jcartstoreback.po.Order;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 8:58
 */
public interface OrderService {
    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                     Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);



}
