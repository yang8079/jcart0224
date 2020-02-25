package com.yh.jcartadministrationback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 15:55
 */
@RestController
@RequestMapping("/image")
public class ImageController {

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image){
        return null;
    }
}
