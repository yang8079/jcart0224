package com.yh.jcartadministrationback.service;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.dto.in.ReturnSearchInDTO;
import com.yh.jcartadministrationback.po.Return;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-07 9:21
 */
public interface ReturnService {

    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);

}
