package com.great.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户账号信息表
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="UserAccount对象", description="用户账号信息表")
public class UserAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户唯一标识")
    private Long userId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "密码，加盐后")
    private String password;

    @ApiModelProperty(value = "别名，显示名称，默认与用户名一致，可修改")
    private String nickname;

    @ApiModelProperty(value = "图像URL")
    private String headImage;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "删除标识")
    private Integer deleteFlag;


}
