package com.yh.jcartstoreback.controller;

import com.yh.jcartstoreback.dto.in.ReturnApplyInDTO;
import com.yh.jcartstoreback.dto.out.PageOutDTO;
import com.yh.jcartstoreback.dto.out.ReturnListOutDTO;
import com.yh.jcartstoreback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:42
 */

@RestController
@RequestMapping("/return")
public class ReturnController {


    @PostMapping("/apply")
    public Integer apply(@RequestBody ReturnApplyInDTO returnApplyInDTO,
                         @RequestAttribute Integer customerId){
        return null;
    }

    @GetMapping("/getList")
    public PageOutDTO<ReturnListOutDTO> getList(@RequestAttribute Integer customerId,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/cancel")
    public void cancel(@RequestBody Integer returnId){

    }

}
