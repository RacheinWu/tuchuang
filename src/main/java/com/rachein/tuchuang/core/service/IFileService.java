package com.rachein.tuchuang.core.service;

import com.rachein.tuchuang.entity.DB.FileDB;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 文件 服务类
 * </p>
 *
 * @author 吴远健
 * @since 2022-09-19
 */
public interface IFileService extends IService<FileDB> {

    String upload(MultipartFile file, String type, String appid);

    void batchUpload(List<MultipartFile> files, String type, String appid);

}
