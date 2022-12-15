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
 * 版本控制表
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_version")
@Schema(name = "TVersion对象", description = "版本控制表")
@NoArgsConstructor
@AllArgsConstructor
public class TVersion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 每个版本对应的唯一自增Id(非空)")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "日期 当前版本中用户所记录的时间(非空)")
    @TableField(value = "date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime date;

    @Schema(name = "标签 标签列表(可空)")
    @TableField(value = "tags", fill = FieldFill.INSERT_UPDATE)
    private String tags;

    @Schema(name = "创建者 当前版本的创建者(非空)")
    @TableField(value = "creator_id", fill = FieldFill.INSERT_UPDATE)
    private Integer creatorId;

    @Schema(name = "实验名称 当前版本的实验名称(可空)")
    @TableField(value = "name", fill = FieldFill.INSERT_UPDATE)
    private String name;

    @Schema(name = "实验内容序列化数据 当前版本模块序列化后的数据(可空)")
    @TableField(value = "data", fill = FieldFill.INSERT_UPDATE)
    private String data;

    @Schema(name = "创建日期 当前版本的创建时间(非空)")
    @TableField(value = "create_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createDate;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;
}
