package com.yh.jcartadministrationback.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.SecureRandom;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-09 11:10
 */
@Configuration
public class BeanConfig {
    @Bean
    public SecureRandom secureRandom(){
       return new SecureRandom();
    }

}
