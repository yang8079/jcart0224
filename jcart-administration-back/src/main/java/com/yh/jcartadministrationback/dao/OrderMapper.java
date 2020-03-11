package com.yh.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.yh.jcartadministrationback.dto.out.OrderListOutDTO;
import com.yh.jcartadministrationback.po.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrderMapper {
    int deleteByPrimaryKey(Long orderId);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    //分页查询
    Page<OrderListOutDTO> search(
            Long orderId, @Param("status") Byte status,
            @Param("totalPrice") Double totalPrice,
            @Param("customerName") String customerName,
            @Param("startTime") Date startTime,
            @Param("endTime") Date endTime
    );
}