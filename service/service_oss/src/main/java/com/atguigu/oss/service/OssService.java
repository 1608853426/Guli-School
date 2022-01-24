package com.atguigu.oss.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author SoonMachine
 * @date 2022-1-23 11:22:25
 */
public interface OssService {

    /**
     * 上传头像接口
     * @param file 头像文件
     * @return url
     */
    public String uploadFileAvatar(MultipartFile file);
}
