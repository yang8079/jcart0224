package com.yh.jcartstoreback.dto.in;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-26 14:41
 */
public class ProductSearchInDTO {
    private String keyword;
    private Byte sortBy;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Byte getSortBy() {
        return sortBy;
    }

    public void setSortBy(Byte sortBy) {
        this.sortBy = sortBy;
    }
}

