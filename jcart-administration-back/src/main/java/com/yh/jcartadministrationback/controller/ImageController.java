package com.yh.jcartadministrationback.controller;

import com.yh.jcartadministrationback.constant.ClientExceptionConstant;
import com.yh.jcartadministrationback.exception.ClientException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @Description
 * @Author Yh
 * @Date 2020-02-25 15:55
 */
@RestController
@RequestMapping("/image")
@CrossOrigin
public class ImageController {

    private List<String> imageExts= Arrays.asList("jpg","jpeg","png");

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile image) throws IOException, ClientException {
        String originalFilename = image.getOriginalFilename();
        String[] splits = originalFilename.split("\\.");
        String ext = splits[splits.length - 1];
        ext = ext.toLowerCase();
        //todo judge with content type
        boolean contains = imageExts.contains(ext);
        if (!contains){
            throw new ClientException(ClientExceptionConstant.IMAGE_INVALID_ERRCODE, ClientExceptionConstant.IMAGE_INVALID_ERRMSG);
        }
        String uuid = UUID.randomUUID().toString();
        String filename = String.format("%s.%s", uuid, ext);
        String filepath = String.format("www/image/%s", filename);
        try(FileOutputStream out = new FileOutputStream(filepath)){
            byte[] data = image.getBytes();
            out.write(data);
        }
        return filename;
    }

}
