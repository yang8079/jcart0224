package com.yh.jcartadministrationback.controller;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.yh.jcartadministrationback.dto.in.ProductSearchInDTO;
import com.yh.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.yh.jcartadministrationback.dto.out.PageOutDTO;
import com.yh.jcartadministrationback.dto.out.ProductListOutDTO;
import com.yh.jcartadministrationback.dto.out.ProductShowOutDTO;
import com.yh.jcartadministrationback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:52
 */
@RestController//@Controller+@ResponseBody
@RequestMapping("/product")
@CrossOrigin//跨域
public class ProductController {

    @Autowired
    private ProductService productService;
    //查询商品列表+分页
    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(pageNum);

        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }
    //添加商品
    @PostMapping("/create")
    public Integer create(@RequestBody ProductCreateInDTO productCreateInDTO){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }
    //获取商品的id回显
    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }
    //更新商品
    @PostMapping("/update")
    public void update(@RequestBody ProductUpdateInDTO productUpdateInDTO){
        productService.update(productUpdateInDTO);
    }
    //删除商品
    @PostMapping("/delete")
    public void delete(@RequestBody Integer productId){
        productService.delete(productId);
    }
    //批量删除商品
    @PostMapping("/batchDelete")
    public void batchDelete(@RequestBody List<Integer> productIds){
        productService.batchDelete(productIds);
    }

}
