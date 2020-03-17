package com.yh.jcartadministrationback.dao;

import com.yh.jcartadministrationback.po.Administrator;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.*;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AdministratorMapperTest {

    @Autowired
    private  AdministratorMapper administratorMapper;

    @Test
    void selectByUsername() {
        String username="yh";
        Administrator administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);
        username="yanghao";
        Administrator administrator1 = administratorMapper.selectByUsername(username);
        assertNull(administrator1);

    }
}