package com.yh.jcartadministrationback.service;

import com.yh.jcartadministrationback.po.ReturnHistory;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-09 9:28
 */
public interface ReturnHistoryService {

    List<ReturnHistory> getListByReturnId(Integer returnId);

    Long create(ReturnHistory returnHistory);

}
