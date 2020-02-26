package com.yh.jcartadministrationback.dto.out;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 16:32
 */
public class PageOutDTO<T> {

    private long total;
    private Integer pageSize;
    private Integer pageNum;
    private List<T> list;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
