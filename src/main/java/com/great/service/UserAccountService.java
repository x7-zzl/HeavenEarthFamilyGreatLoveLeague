package com.great.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.great.entity.UserAccount;

import java.util.List;

/**
 * <p>
 * 用户账号信息表 服务类
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
public interface UserAccountService extends IService<UserAccount> {

    /**
     * 查询所有用户的账户信息
     * @return 所有用户的账户信息
     */
    List<UserAccount> listUserAccounts();

}
