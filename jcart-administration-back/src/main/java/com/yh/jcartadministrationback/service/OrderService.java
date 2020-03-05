package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.out.OrderListOutDTO;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-05 19:54
 */
public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

}
