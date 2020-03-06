package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.out.OrderListOutDTO;
import com.yh.jcartadministrationback.dto.out.OrderShowOutDTO;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 19:54
 */
public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

}
