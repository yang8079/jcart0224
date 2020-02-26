package com.yh.jcartstoreback.controller;

import com.yh.jcartstoreback.dto.in.AddressCreateInDTO;
import com.yh.jcartstoreback.dto.in.AddressUpdateInDTO;
import com.yh.jcartstoreback.dto.out.AddressListOutDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:32
 */
@RestController
@RequestMapping("/address")
public class AddressController {

    @GetMapping("/getAddressByCustomerId")
    public List<AddressListOutDTO> getAddressByCustomerId(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody AddressCreateInDTO addressCreateInDTO,
                          @RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody AddressUpdateInDTO addressUpdateInDTO,
                       @RequestAttribute Integer customerId){

    }

    @PostMapping
    public void delete(@RequestBody Integer addressId){

    }

}
