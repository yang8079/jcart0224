package com.yh.jcartstoreback.controller;

import com.yh.jcartstoreback.dto.in.*;
import com.yh.jcartstoreback.dto.out.CustomerGetProfileOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:35
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/register")
    public Integer register(@RequestBody CustomerRegisterInDTO customerRegisterInDTO){
        return null;
    }

    @GetMapping("/login")
    public String login(CustomerLoginInDTO customerLoginInDTO){
        return null;
    }

    @GetMapping("/getProfile")
    public CustomerGetProfileOutDTO getProfile(@RequestAttribute Integer customerId){
        return null;
    }

    @PostMapping("/updateProfile")
    public void updateProfile(@RequestBody CustomerUpdateProfileInDTO customerUpdateProfileInDTO,
                              @RequestAttribute Integer customerId){

    }

    @PostMapping("/changePwd")
    public void changePwd(@RequestBody CustomerChangePwdInDTO customerChangePwdInDTO,
                          @RequestAttribute Integer customerId){

    }

    @GetMapping("/getPwdResetCode")
    public String getPwdResetCode(@RequestParam String email){
        return null;
    }

    @PostMapping("/resetPwd")
    public void resetPwd(@RequestBody CustomerResetPwdInDTO customerResetPwdInDTO){

    }


}
