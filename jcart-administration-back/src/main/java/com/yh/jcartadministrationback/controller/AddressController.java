package com.yh.jcartadministrationback.controller;


import com.yh.jcartadministrationback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:21
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getListByCustomerId")
    public List<AddressListOutDTO> getListByCustomerId(@RequestParam Integer customerId){
        return null;
    }
}
