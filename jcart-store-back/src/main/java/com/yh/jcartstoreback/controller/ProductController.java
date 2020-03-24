package com.yh.jcartstoreback.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.yh.jcartstoreback.dto.in.ProductSearchInDTO;
import com.yh.jcartstoreback.dto.out.PageOutDTO;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.dto.out.ProductShowOutDTO;
import com.yh.jcartstoreback.mq.HotProductDTO;
import com.yh.jcartstoreback.po.ProductOperation;
import com.yh.jcartstoreback.service.ProductOperationService;
import com.yh.jcartstoreback.service.ProductService;import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductOperationService productOperationService;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam(required = false, defaultValue = "1") Integer pageNum){
        Page<ProductListOutDTO> page = productService.search(productSearchInDTO, pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getShowById(productId);
        //todo send msg to kafka
        HotProductDTO hotProductDTO = new HotProductDTO();
        hotProductDTO.setProductId(productId);
        hotProductDTO.setProductCode(productShowOutDTO.getProductCode());
        kafkaTemplate.send("test", JSON.toJSONString(hotProductDTO));
//        productOperationService.count(productId);
        return productShowOutDTO;
    }

    @GetMapping("/hot")
    public List<ProductOperation> hot(){
        String hotProductsJson = redisTemplate.opsForValue().get("HotProducts");
        if (hotProductsJson != null){
            List<ProductOperation> productOperations = JSON.parseArray(hotProductsJson, ProductOperation.class);
            return productOperations;
        }else {
            List<ProductOperation> hotProducts = productOperationService.selectHotProduct();
            redisTemplate.opsForValue().set("HotProducts", JSON.toJSONString(hotProducts));
            return hotProducts;
        }
    }


}
