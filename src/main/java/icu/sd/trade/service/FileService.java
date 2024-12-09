package icu.sd.trade.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Author:
 * @Date:2024/12-8 11:32
 * @Version:v1.0.0
 * @Description：上传文件服务
 **/

public interface FileService {

    /**
     * 上传文件
     *
     * @param multipartFile 文件
     * @param fileName      文件名
     * @return 结果
     * @throws IOException io异常
     */
    boolean uploadFile(MultipartFile multipartFile, String fileName) throws IOException;
}

