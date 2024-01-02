package com.great.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.great.entity.UserAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户账号信息表 Mapper 接口
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Mapper
public interface UserAccountMapper extends BaseMapper<UserAccount> {



}
