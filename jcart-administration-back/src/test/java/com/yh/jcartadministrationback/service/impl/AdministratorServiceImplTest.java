package com.yh.jcartadministrationback.service.impl;

import com.yh.jcartadministrationback.po.Administrator;
import com.yh.jcartadministrationback.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdministratorServiceImplTest {

    @Autowired
    private AdministratorService administratorService;
    @Test
    void getByUsername() {
        String username="yh";
        Administrator administrator = administratorService.getByUsername(username);
        assertNotNull(administrator);

        username="yanghao";
        Administrator administrator1 =administratorService.getByUsername(username);
        assertNull(administrator1);
    }
}