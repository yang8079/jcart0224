package com.yh.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.yh.jcartstoreback.dto.in.ProductSearchInDTO;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.dto.out.ProductShowOutDTO;
import com.yh.jcartstoreback.po.Product;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-29 18:09
 */
public interface ProductService {


    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum);



}
