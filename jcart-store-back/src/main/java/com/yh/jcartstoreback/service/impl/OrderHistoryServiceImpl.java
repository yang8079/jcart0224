package com.yh.jcartstoreback.service.impl;

import com.yh.jcartstoreback.dao.OrderHistoryMapper;
import com.yh.jcartstoreback.po.OrderHistory;
import com.yh.jcartstoreback.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 10:06
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
}
