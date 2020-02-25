package com.yh.jcartadministrationback.controller;

import com.yh.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.yh.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.yh.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.yh.jcartadministrationback.dto.out.PageOutDTO;
import com.yh.jcartadministrationback.dto.out.ProductListOutDTO;
import com.yh.jcartadministrationback.dto.out.ProductShowOutDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:52
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

    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        return null;
    }

    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){

    }
}
