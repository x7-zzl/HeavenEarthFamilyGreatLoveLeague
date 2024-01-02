package com.great.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 个人信息详细表
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("userInfo_dtl")
@ApiModel(value="UserinfoDtl对象", description="个人信息详细表")
public class UserinfoDtl implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户详细信息主键")
    @TableId("userInfoDtl_id")
    private Long userinfodtlId;

    @ApiModelProperty(value = "用户信息主键")
    private Long userId;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "手机号，可用来登录")
    private String mobliePhone;

    @ApiModelProperty(value = "所在地区,中国-河南省郑州市")
    private String provinceAddress;

    @ApiModelProperty(value = "地址信息补充")
    private String addressDtl;

    @ApiModelProperty(value = "个人签名")
    private String signature;


}
