package com.great.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Comments对象", description="评论表")
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "当前评论id")
    private Long commentId;

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "评论具体内容")
    private String content;

    @ApiModelProperty(value = "顶层评论id")
    private Long parentId;

    @ApiModelProperty(value = "回复评论的id")
    private Long replyId;

    @ApiModelProperty(value = "发布时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "删除标识")
    private Integer deleteFlag;


}
