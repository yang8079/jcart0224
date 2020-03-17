package com.yh.jcartadministrationback.dao;

import com.github.pagehelper.Page;
import com.yh.jcartadministrationback.po.Administrator;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorId);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorId);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
    //获取用户名
    Administrator selectByUsername(@Param("username") String username);

    //邮箱
    Administrator selectByEmail(@Param("email") String email);

    int batchDelete(@Param("administratorIds") List<Integer> administratorIds);

    Page<Administrator> selectList();
}