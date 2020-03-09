package com.yh.jcartadministrationback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:52
 */
public class ProductSearchInDTO {
    //商品码
    private String productCode;
    //商品名称
    private String productName;
    //商品价格
    private Double price;
    //商品库存量
    private Integer stockQuantity;
    //商品状态
    private Byte status;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
