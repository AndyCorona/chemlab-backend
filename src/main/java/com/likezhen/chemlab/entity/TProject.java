package com.likezhen.chemlab.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * <p>
 * 项目
 * </p>
 *
 * @author likezhen
 * @since 2022-12-15
 */
@Getter
@Setter
@TableName("t_project")
@Schema(name = "TProject对象", description = "项目")
@AllArgsConstructor
@NoArgsConstructor
public class TProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "编号 项目唯一自增主键 Id(非空) ")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @Schema(name = "项目名 项目名称(可空)")
    @TableField(value = "name", fill = FieldFill.INSERT_UPDATE)
    private String name;

    @Schema(name = "创建日期 项目创建时间(非空)")
    @TableField(value = "create_date", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime createDate;

    @Schema(name = "创建者 项目的创建者(非空)")
    @TableField(value = "creator_id", fill = FieldFill.INSERT_UPDATE)
    private Integer creatorId;

    @Schema(name = "实验列表 项目所拥有的所有实验集合(可空)")
    @TableField(value = "reaction_ids", fill = FieldFill.INSERT_UPDATE)
    private String reactionIds;

    @Schema(name = "标识项目类别 标识项目属于群组还是个人(非空)")
    @TableField(value = "is_group", fill = FieldFill.INSERT_UPDATE)
    private Boolean isGroup;

    @Schema(name = "冗余列1 冗余列1")
    @TableField(value = "back_up1", fill = FieldFill.INSERT_UPDATE)
    private String backUp1;

    @Schema(name = "冗余列2 冗余列2")
    @TableField(value = "back_up2", fill = FieldFill.INSERT_UPDATE)
    private String backUp2;

    @Override
    public String toString() {
        return "TProject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createDate=" + createDate +
                ", creatorId=" + creatorId +
                ", reactionIds='" + reactionIds + '\'' +
                ", isGroup=" + isGroup +
                ", backUp1='" + backUp1 + '\'' +
                ", backUp2='" + backUp2 + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TProject project = (TProject) o;
        return Objects.equals(id, project.id) && Objects.equals(name, project.name) && Objects.equals(createDate, project.createDate) && Objects.equals(creatorId, project.creatorId) && Objects.equals(reactionIds, project.reactionIds) && Objects.equals(isGroup, project.isGroup) && Objects.equals(backUp1, project.backUp1) && Objects.equals(backUp2, project.backUp2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createDate, creatorId, reactionIds, isGroup, backUp1, backUp2);
    }
}
