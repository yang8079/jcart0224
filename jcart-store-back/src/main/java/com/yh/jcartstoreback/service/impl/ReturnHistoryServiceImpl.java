package com.yh.jcartstoreback.service.impl;

import com.yh.jcartstoreback.dao.ReturnHistoryMapper;
import com.yh.jcartstoreback.dao.ReturnMapper;
import com.yh.jcartstoreback.po.ReturnHistory;
import com.yh.jcartstoreback.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-06 17:27
 */
@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {


    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Override
    public List<ReturnHistory> getByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectByReturnId(returnId);

        return returnHistories;
    }
}
