package com.yh.jcartstoreback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.yh.jcartstoreback.dao")
@EnableCaching
@EnableScheduling
public class JcartStoreBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(JcartStoreBackApplication.class, args);
    }

}

