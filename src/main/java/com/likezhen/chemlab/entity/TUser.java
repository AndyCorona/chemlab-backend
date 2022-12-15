package com.likezhen.chemlab.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_user")
@Schema(name = "TUser对象", description = "用户")
@NoArgsConstructor
@AllArgsConstructor
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 数据库自动生成的唯一 ID(非空)")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "名字 用户名字(唯一、非空)")
    @TableField(value = "name", fill = FieldFill.INSERT_UPDATE)
    private String name;

    @Schema(name = "邮箱 用户邮箱(唯一、非空)")
    @TableField(value = "email", fill = FieldFill.INSERT_UPDATE)
    private String email;

    @Schema(name = "密码 加密后的密码(非空)")
    @TableField(value = "password", fill = FieldFill.INSERT_UPDATE)
    private String password;

    @Schema(name = "创建日期 用户注册事件(非空)")
    @TableField(value = "create_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createDate;

    @Schema(name = "更新时间 用户最近一次修改个人信息时间(非空)")
    @TableField(value = "update_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateDate;

    @Schema(name = "学校 用户所在院校(可空)")
    @TableField(value = "school", fill = FieldFill.INSERT_UPDATE)
    private String school;

    @Schema(name = "研究领域 用户目前的研究领域(可空)")
    @TableField(value = "field", fill = FieldFill.INSERT_UPDATE)
    private String field;

    @Schema(name = "专业 用户的专业(可空)")
    @TableField(value = "major", fill = FieldFill.INSERT_UPDATE)
    private String major;

    @Schema(name = "首次登录 标识用户是否首次登录(非空)")
    @TableField(value = "first_login", fill = FieldFill.INSERT_UPDATE)
    private Boolean fisrtLogin;

    @Schema(name = "标语 用户个人空间标语(非空)")
    @TableField(value = "slogon", fill = FieldFill.INSERT_UPDATE)
    private String slogon;

    @Schema(name = "头像 用户头像路径(非空)")
    @TableField(value = "logo", fill = FieldFill.INSERT_UPDATE)
    private String logo;

    @Schema(name = "项目列表 用户所拥有的项目列表(可空)")
    @TableField(value = "project_ids", fill = FieldFill.INSERT_UPDATE)
    private String projectIds;

    @Schema(name = "群组  用户所处于的群组(可空)")
    @TableField(value = "group_id", fill = FieldFill.INSERT_UPDATE)
    private Integer groupId;

    @Schema(name = "模版列表 用户所拥有的模版列表(可空)")
    @TableField(value = "template_ids", fill = FieldFill.INSERT_UPDATE)
    private String templateIds;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;
}
