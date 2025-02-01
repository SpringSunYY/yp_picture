package com.lz.picture.controller;

import com.lz.picture.common.BaseResponse;
import com.lz.picture.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: picture
 * Package: com.lz.picture.controller
 * Author: YY
 * CreateTime: 2025-02-01  16:38
 * Description: MainController
 * Version: 1.0
 */
@RestController
@RequestMapping("/")
public class MainController {

    /**
     * 健康检查
     */
    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}