package com.yh.jcartstoreback.service;

        import com.yh.jcartstoreback.po.ProductOperation;

        import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-22 19:08
 */
public interface ProductOperationService {
    void count(Integer productId);

    List<ProductOperation> selectHotProduct();

}
