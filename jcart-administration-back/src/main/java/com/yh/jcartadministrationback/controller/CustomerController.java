package com.yh.jcartadministrationback.controller;

import com.yh.jcartadministrationback.dto.in.CustomerSearchInDTO;
import com.yh.jcartadministrationback.dto.out.CustomerListOutDTO;
import com.yh.jcartadministrationback.dto.out.CustomerShowOutDTO;
import com.yh.jcartadministrationback.dto.out.PageOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:37
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        return null;
    }

    @PostMapping("/disable")
    public void disable(@RequestParam Integer customerId){

    }
}
