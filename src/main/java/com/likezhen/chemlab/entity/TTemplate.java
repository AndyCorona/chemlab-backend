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
 * 模版
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_template")
@Schema(name = "TTemplate对象", description = "模版")
@NoArgsConstructor
@AllArgsConstructor
public class TTemplate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 模版唯一自增长ID(非空)")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "创建者 模版创建者(非空)")
    @TableField(value = "creator_id", fill = FieldFill.INSERT_UPDATE)
    private Integer creatorId;

    @Schema(name = "名称 模版名称(非空)")
    @TableField(value = "name", fill = FieldFill.INSERT_UPDATE)
    private String name;

    @Schema(name = "数据 模版中保存的序列化数据(可空)")
    @TableField(value = "data", fill = FieldFill.INSERT_UPDATE)
    private String data;

    @Schema(name = "创建日期 模版的创建时间(非空)")
    @TableField(value = "create_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createDate;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;


}
