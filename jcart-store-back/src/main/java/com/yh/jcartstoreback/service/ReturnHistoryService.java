package com.yh.jcartstoreback.service;

import com.yh.jcartstoreback.po.ReturnHistory;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 17:27
 */
public interface ReturnHistoryService {
    //历史退货列表
    List<ReturnHistory> getByReturnId(Integer returnId);

}
