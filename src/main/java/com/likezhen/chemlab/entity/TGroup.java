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
 * 群组
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_group")
@Schema(name = "TGroup对象", description = "群组")
@AllArgsConstructor
@NoArgsConstructor
public class TGroup implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 群组 Id(非空)")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "群组唯一标识符(非空)")
    @TableField(value = "uuid", fill = FieldFill.INSERT_UPDATE)
    private String uuid;

    @Schema(name = "名字 群组名字(非空)")
    @TableField(value = "name", fill = FieldFill.INSERT_UPDATE)
    private String name;

    @Schema(name = "标语 群组标语(可空)")
    @TableField(value = "slogon", fill = FieldFill.INSERT_UPDATE)
    private String slogon;

    @Schema(name = "成员列表 群组的所有成员(可空)")
    @TableField(value = "member_ids", fill = FieldFill.INSERT_UPDATE)
    private String memberIds;

    @Schema(name = "项目列表 群组的所有项目(可空)")
    @TableField(value = "project_ids", fill = FieldFill.INSERT_UPDATE)
    private String projectIds;

    @Schema(name = "创建日期 群组创建时间(非空)")
    @TableField(value = "create_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createDate;

    @Schema(name = "创建者 群组的创建者 ID(非空)")
    @TableField(value = "creator_id", fill = FieldFill.INSERT_UPDATE)
    private Integer creatorId;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;


}
