package com.yh.jcartstoreback.service;

import com.github.pagehelper.Page;
import com.yh.jcartstoreback.po.Return;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 16:01
 */
public interface ReturnService {
    //创建
    Integer create(Return aReturn);
    //分页了列表
    Page<Return> getPageCustomerId(Integer customerId,Integer pageNum);
    //回显
    Return getById(Integer returnId);
}
