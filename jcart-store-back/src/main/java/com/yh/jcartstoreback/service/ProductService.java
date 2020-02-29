package com.yh.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.dto.out.ProductShowOutDTO;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-29 18:09
 */
public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
