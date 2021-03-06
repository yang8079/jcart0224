package com.yh.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.OrderSearchInDTO;
import com.yh.jcartadministrationback.dto.out.*;
import com.yh.jcartadministrationback.po.Order;
import com.yh.jcartadministrationback.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:42
 */
@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;
    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam(required = false,defaultValue = "1") Integer pageNum){


        Page<OrderListOutDTO> page = orderService.search(orderSearchInDTO,pageNum);
        PageOutDTO<OrderListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        OrderShowOutDTO orderShowOutDTO = orderService.getById(orderId);
        return orderShowOutDTO;
    }

    @GetMapping("/getInvoiceInfo")
    public OrderInvoiceShowOutDTO getInvoiceInfo(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestParam Long orderId){
        return null;
    }

}
