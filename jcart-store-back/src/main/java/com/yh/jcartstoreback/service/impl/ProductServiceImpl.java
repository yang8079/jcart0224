package com.yh.jcartstoreback.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yh.jcartstoreback.dao.ProductDetailMapper;
import com.yh.jcartstoreback.dao.ProductMapper;
import com.yh.jcartstoreback.dto.in.ProductSearchInDTO;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.dto.out.ProductShowOutDTO;
import com.yh.jcartstoreback.enumeration.ProductStatus;
import com.yh.jcartstoreback.po.Product;
import com.yh.jcartstoreback.po.ProductDetail;
import com.yh.jcartstoreback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-29 18:10
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public Product getById(Integer productId) {
        Product product = productMapper.selectByPrimaryKey(productId);
        return product;
    }

    @Override
    public ProductShowOutDTO getShowById(Integer productId) {

        Product product = productMapper.selectByPrimaryKey(productId);
        ProductDetail productDetail = productDetailMapper.selectByPrimaryKey(productId);

        ProductShowOutDTO productShowOutDTO = new ProductShowOutDTO();
        productShowOutDTO.setProductId(product.getProductId());
        productShowOutDTO.setProductCode(product.getProductCode());
        productShowOutDTO.setProductName(product.getProductName());
        productShowOutDTO.setPrice(product.getPrice());
        productShowOutDTO.setDiscount(product.getDiscount());
        productShowOutDTO.setMainPicUrl(product.getMainPicUrl());
        productShowOutDTO.setRewordPoints(product.getRewordPoints());
        productShowOutDTO.setStockQuantity(product.getStockQuantity());

        productShowOutDTO.setDescription(productDetail.getDescription());
        String otherPicUrlsJson = productDetail.getOtherPicUrls();
        List<String> otherPicUrls = JSON.parseArray(otherPicUrlsJson, String.class);
        productShowOutDTO.setOtherPicUrls(otherPicUrls);

        return productShowOutDTO;
    }

    @Override
    public Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum) {
        PageHelper.startPage(pageNum, 10);
        Page<ProductListOutDTO> page = productMapper.search(productSearchInDTO.getKeyword(), (byte) ProductStatus.OnSales.ordinal());
        return page;
    }
}

