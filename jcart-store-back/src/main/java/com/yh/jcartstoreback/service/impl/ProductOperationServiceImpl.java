package com.yh.jcartstoreback.service.impl;

import com.yh.jcartstoreback.dao.ProductOperationMapper;
import com.yh.jcartstoreback.po.ProductOperation;
import com.yh.jcartstoreback.service.ProductOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-22 19:08
 */
@Service
public class ProductOperationServiceImpl implements ProductOperationService {

    @Autowired
    private ProductOperationMapper productOperationMapper;
    @Override
    public void count(Integer productId) {
        ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);
        if (productOperation==null){
            productOperation = new ProductOperation();
            productOperation.setProductId(productId);
            productOperation.setAddCount(1);
            productOperation.setDayCount(1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.insertSelective(productOperation);
        }else{
            productOperation.setAddCount(productOperation.getAddCount()+1);
            productOperation.setDayCount(productOperation.getDayCount()+1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.updateByPrimaryKeySelective(productOperation);
        }
    }

    @Override
    public List<ProductOperation> selectHotProduct() {
        List<ProductOperation> hotProducts = productOperationMapper.selectHotProduct();
        return hotProducts;
    }
}
