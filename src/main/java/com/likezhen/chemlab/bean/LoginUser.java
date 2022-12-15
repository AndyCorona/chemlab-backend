package com.likezhen.chemlab.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

/**
 * 用户创建 token 的用户信息
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoginUser {
    private Integer userid;
    private Integer groupId;
    private String password;
}
