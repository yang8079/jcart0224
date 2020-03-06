package com.yh.jcartadministrationback.service.impl;

import com.yh.jcartadministrationback.dao.OrderHistoryMapper;
import com.yh.jcartadministrationback.po.OrderHistory;
import com.yh.jcartadministrationback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 11:03
 */
@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {

    @Autowired
    private OrderHistoryMapper orderHistoryMapper;

   @Override
    public List<OrderHistory> getByOrderId(Long orderId) {
       List<OrderHistory> orderHistories = orderHistoryMapper.selectByOrderId(orderId);

       return orderHistories;
    }

    @Override
    public Long create(OrderHistory orderHistory) {
       orderHistoryMapper.insertSelective(orderHistory);
        Long orderHistoryId = orderHistory.getOrderHistoryId();
        return orderHistoryId;
    }
}
