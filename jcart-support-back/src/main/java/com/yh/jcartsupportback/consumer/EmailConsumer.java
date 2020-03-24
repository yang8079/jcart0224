package com.yh.jcartsupportback.consumer;

import com.yh.jcartsupportback.mq.EmailEvent;
import com.yh.jcartsupportback.util.EmailUtil;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-20 15:56
 */
@Component
//@RocketMQMessageListener(topic = "SendEmail", consumerGroup = "jcart-support-group01")
public class EmailConsumer implements RocketMQListener<EmailEvent> {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmailUtil emailUtil;

    @Value("${spring.mail.username}")
    private String fromEmail;

    @Override
    public void onMessage(EmailEvent emailEvent) {
        logger.info("{}", emailEvent);
        emailUtil.send(fromEmail, emailEvent.getToEmail(), emailEvent.getTitle(), emailEvent.getContent());
    }

}

