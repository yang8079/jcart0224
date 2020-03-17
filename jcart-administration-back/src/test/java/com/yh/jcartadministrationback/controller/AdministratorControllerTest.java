package com.yh.jcartadministrationback.controller;

import com.yh.jcartadministrationback.constant.ClientExceptionConstant;
import com.yh.jcartadministrationback.dto.in.AdministratorLoginInDTO;
import com.yh.jcartadministrationback.dto.out.AdministratorLoginOutDTO;
import com.yh.jcartadministrationback.exception.ClientException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AdministratorControllerTest {

    @Autowired
    private AdministratorController administratorController;
    @Test
    void login() throws ClientException {
        AdministratorLoginInDTO administratorLoginInDTO = new AdministratorLoginInDTO();
        administratorLoginInDTO.setUsername("yh");
        administratorLoginInDTO.setPassword("123");
        AdministratorLoginOutDTO loginOutDTO = administratorController.login(administratorLoginInDTO);
        assertNotNull(loginOutDTO);

        administratorLoginInDTO.setUsername("gjl");
        administratorLoginInDTO.setPassword("abcdef");
        try {
            loginOutDTO=administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADMINISTRATOR_USERNAME_NOT_EXIST_ERRCODE,errCode);
        }

        administratorLoginInDTO.setUsername("yh");
        administratorLoginInDTO.setPassword("1234");
        try {
            administratorController.login(administratorLoginInDTO);
        }catch (ClientException ex){
            String errCode = ex.getErrCode();
            assertEquals(ClientExceptionConstant.ADNINISTRATOR_PASSWORD_INVALID_ERRCODE,errCode);
        }

    }
}