package com.rachein.tuchuang.core.controller;

import com.rachein.tuchuang.core.service.IFileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 文件 前端控制器
 * </p>
 *
 * @author 吴远健
 * @since 2022-09-19
 */
@Api(tags = "图床")
@RestController
@RequestMapping("api/file")
public class FileController {

    @Autowired
    private IFileService fileService;

    @ApiOperation("上传单文件")
    public String upload(MultipartFile file, String type, String appid) {
        String path = fileService.upload(file, type, appid);
        return path;
    }

    @ApiOperation("上传多文件")
    public void upload(List<MultipartFile> files, String type, String appid) {
        //是否存在文件
        //检测文件大小
        //检测文件类型
        //上传
        //
    }
}
