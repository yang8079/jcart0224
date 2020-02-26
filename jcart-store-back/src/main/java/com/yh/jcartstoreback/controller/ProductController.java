package com.yh.jcartstoreback.controller;

import com.yh.jcartstoreback.dto.in.ProductSearchInDTO;
import com.yh.jcartstoreback.dto.out.PageOutDTO;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:41
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        return null;
    }
}
