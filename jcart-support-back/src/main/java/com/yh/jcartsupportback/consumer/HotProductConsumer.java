package com.yh.jcartsupportback.consumer;

import com.alibaba.fastjson.JSON;
import com.yh.jcartsupportback.mq.HotProductDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-23 17:09
 */
@Component
public class HotProductConsumer {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @KafkaListener(topics = "test",groupId = "hot-product")
    public  void  handleHotProduct(String hotProductJsonStr){
        logger.info("handle productId:{}",hotProductJsonStr);
        HotProductDTO hotProductDTO = JSON.parseObject(hotProductJsonStr, HotProductDTO.class);
        /**
         * ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);
         *         if (productOperation==null){
         *             productOperation = new ProductOperation();
         *             productOperation.setProductId(productId);
         *             productOperation.setAddCount(1);
         *             productOperation.setDayCount(1);
         *             productOperation.setRecentTime(new Date());
         *             productOperationMapper.insertSelective(productOperation);
         *         }else{
         *             productOperation.setAddCount(productOperation.getAddCount()+1);
         *             productOperation.setDayCount(productOperation.getDayCount()+1);
         *             productOperation.setRecentTime(new Date());
         *             productOperationMapper.updateByPrimaryKeySelective(productOperation);
         *         }
         */
    }
}
