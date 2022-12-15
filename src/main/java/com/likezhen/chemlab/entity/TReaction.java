package com.likezhen.chemlab.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * 实验
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_reaction")
@Schema(name = "TReaction对象", description = "实验")
@NoArgsConstructor
@AllArgsConstructor
public class TReaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 实验唯一自增长ID(非空)")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "创建者 实验的创建者(非空)")
    @TableField(value = "creator_id", fill = FieldFill.INSERT_UPDATE)
    private Integer creatorId;

    @Schema(name = "版本列表 实验的版本列表(非空)")
    @TableField(value = "version_ids", fill = FieldFill.INSERT_UPDATE)
    private String versionIds;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;


}
