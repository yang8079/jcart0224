package com.yh.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.out.ProductListOutDTO;
import com.yh.jcartadministrationback.po.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    //批量
    int batchDelete(@Param("productIds") List<Integer> productIds);
    //查询
    Page<ProductListOutDTO> search();


}