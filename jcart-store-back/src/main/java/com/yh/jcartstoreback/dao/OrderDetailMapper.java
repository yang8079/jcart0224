package com.yh.jcartstoreback.dao;

import com.yh.jcartstoreback.po.OrderDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderDetail record);

    int insertSelective(OrderDetail record);

    OrderDetail selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderDetail record);

    int updateByPrimaryKeyWithBLOBs(OrderDetail record);

    int updateByPrimaryKey(OrderDetail record);
}