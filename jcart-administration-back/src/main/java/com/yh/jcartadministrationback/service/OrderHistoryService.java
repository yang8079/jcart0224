package com.yh.jcartadministrationback.service;

import com.yh.jcartadministrationback.po.OrderHistory;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 11:03
 */
public interface OrderHistoryService {

    List<OrderHistory> getByOrderId(Long orderId);

    Long create(OrderHistory orderHistory);

}
