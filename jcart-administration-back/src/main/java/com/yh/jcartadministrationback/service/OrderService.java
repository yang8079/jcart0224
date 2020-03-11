package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.yh.jcartadministrationback.dto.out.OrderListOutDTO;
import com.yh.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.yh.jcartadministrationback.po.Order;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 19:54
 */
public interface OrderService {

    Page<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);

}
