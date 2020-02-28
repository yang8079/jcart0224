package com.yh.jcartadministrationback.dao;

import com.yh.jcartadministrationback.po.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDetailMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);

    //批量删除
    int batchDelete(@Param("productIds") List<Integer> productIds);
}