package com.yh.jcartadministrationback.service.impl;

import com.yh.jcartadministrationback.dao.ReturnHistoryMapper;
import com.yh.jcartadministrationback.po.Return;
import com.yh.jcartadministrationback.po.ReturnHistory;
import com.yh.jcartadministrationback.service.ReturnHistoryService;
import com.yh.jcartadministrationback.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-09 9:28
 */
@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {
    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @Autowired
    private ReturnService returnService;


    @Override
    public List<ReturnHistory> getListByReturnId(Integer returnId) {
        List<ReturnHistory> returnHistories = returnHistoryMapper.selectListByReturnId(returnId);
        return returnHistories;
    }

    @Override
    @Transactional
    public Long create(ReturnHistory returnHistory) {
        returnHistoryMapper.insertSelective(returnHistory);
        Long returnHistoryId = returnHistory.getReturnHistoryId();

        Return aReturn = new Return();
        aReturn.setReturnId(returnHistory.getReturnId());
        aReturn.setUpdateTime(new Date());
        returnService.update(aReturn);

        return returnHistoryId;
    }
}
