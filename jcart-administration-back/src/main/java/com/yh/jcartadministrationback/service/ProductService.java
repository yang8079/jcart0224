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
public interface ProductService {
    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    void delete(Integer productId);

    void batchDelete(List<Integer> productIds);

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);
}
