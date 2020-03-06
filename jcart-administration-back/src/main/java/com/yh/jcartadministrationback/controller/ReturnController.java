package com.yh.jcartadministrationback.controller;

import com.yh.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.yh.jcartadministrationback.dto.in.ReturnUpdateActionInDTO;
import com.yh.jcartadministrationback.dto.out.PageOutDTO;
import com.yh.jcartadministrationback.dto.out.ReturnListOutDTO;
import com.yh.jcartadministrationback.dto.out.ReturnShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:55
 */
@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(ReturnSearchInDTO returnSearchInDTO,
                                               @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }

}
