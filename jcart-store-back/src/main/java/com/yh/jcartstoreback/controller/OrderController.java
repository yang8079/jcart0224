package com.yh.jcartstoreback.controller;

import com.yh.jcartstoreback.dto.in.OrderCheckoutInDTO;
import com.yh.jcartstoreback.dto.out.OrderListOutDTO;
import com.yh.jcartstoreback.dto.out.OrderShowOutDTO;
import com.yh.jcartstoreback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:38
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @PostMapping("/checkout")
    public Integer checkout(@RequestBody OrderCheckoutInDTO orderCheckoutInDTO,
                            @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<OrderListOutDTO> getList(@RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Long orderId){
        return null;
    }
}
