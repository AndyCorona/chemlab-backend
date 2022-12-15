package com.likezhen.chemlab.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "登录注册相关接口")
public class LoginController {
    @GetMapping("/login")
    @Schema(name = "登录接口有")
    public String hello() {
        return "you have login into chemlab";
    }
}
