package com.yh.jcartstoreback.service;

import com.yh.jcartstoreback.po.OrderHistory;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 10:05
 */
public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

}

