package com.yh.jcartstoreback.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-24 11:50
 */
@Component
public class ProductScheduler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Scheduled(fixedDelay = 30*1000)
    public void removeHotProduct(){
        logger.info("remove hot product");
        String key = "test";
        Boolean delete = redisTemplate.delete(key);
    }

}