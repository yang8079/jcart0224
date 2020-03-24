package com.yh.jcartstoreback.dao;

import com.github.pagehelper.Page;
import com.yh.jcartstoreback.dto.out.ProductListOutDTO;
import com.yh.jcartstoreback.po.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    Page<ProductListOutDTO> search();

    Page<ProductListOutDTO> search(@Param("keyword") String keyword,
                                   @Param("status") Byte status);
}