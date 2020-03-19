package com.yh.jcartadministrationback.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author Yh
 * @Date 2020-03-19 16:08
 */
@Component
public class EmailUtil {

    //日志
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JavaMailSender mailSender;

    @Async//spring中的封装好的异步处理注解
    public void send(String fromEmail,
                     String toEmail,
                     String title,
                     String content){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(fromEmail);
        message.setTo(toEmail);
        message.setSubject(title);
        message.setText(content);
        mailSender.send(message);
        //打印日志信息
        logger.info("send email ended");
    }

}

