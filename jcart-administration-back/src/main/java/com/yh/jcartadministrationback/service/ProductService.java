package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.ProductCreateInDTO;
import com.yh.jcartadministrationback.dto.in.ProductUpdateInDTO;
import com.yh.jcartadministrationback.dto.out.ProductListOutDTO;
import com.yh.jcartadministrationback.dto.out.ProductShowOutDTO;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 16:38
 */
//ProductService接口方法
public interface ProductService {
    //添加商品
    Integer create(ProductCreateInDTO productCreateInDTO);
    //更新修改商品
    void update(ProductUpdateInDTO productUpdateInDTO);
    //删除一条商品
    void delete(Integer productId);
    //删除多个商品
    void batchDelete(List<Integer> productIds);
    //查询商品列表
    Page<ProductListOutDTO> search(Integer pageNum);
    //查询商品id回显
    ProductShowOutDTO getById(Integer productId);
}
