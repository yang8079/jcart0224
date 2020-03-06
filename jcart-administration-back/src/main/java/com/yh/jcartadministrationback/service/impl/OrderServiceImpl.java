package com.yh.jcartadministrationback.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yh.jcartadministrationback.dao.OrderDetailMapper;
import com.yh.jcartadministrationback.dao.OrderHistoryMapper;
import com.yh.jcartadministrationback.dao.OrderMapper;
import com.yh.jcartadministrationback.dto.out.OrderListOutDTO;
import com.yh.jcartadministrationback.dto.out.OrderShowOutDTO;
import com.yh.jcartadministrationback.po.Order;
import com.yh.jcartadministrationback.po.OrderDetail;
import com.yh.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 19:56
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderDetailMapper orderDetailMapper;


    @Override
    public Page<OrderListOutDTO> search(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        Page<OrderListOutDTO> page = orderMapper.search();
        return page;
    }

    @Override
    public OrderShowOutDTO getById(Long orderId) {
        Order order = orderMapper.selectByPrimaryKey(orderId);
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderId);
        OrderShowOutDTO orderShowOutDTO = new OrderShowOutDTO();
        orderShowOutDTO.setOrderId(orderId);
        orderShowOutDTO.setCustomerId(order.getCustomerId());
        return null;
    }
}
