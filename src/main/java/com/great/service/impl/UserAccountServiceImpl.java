package com.great.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.great.entity.UserAccount;
import com.great.mapper.UserAccountMapper;
import com.great.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户账号信息表 服务实现类
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;


    /**
     * 查询所有用户的账户信息
     *
     * @return 所有用户的账户信息
     */
    @Override
    public List<UserAccount> listUserAccounts() {
        LambdaQueryWrapper<UserAccount> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(UserAccount::getUsername,"z");
        return userAccountMapper.selectList(lambdaQueryWrapper);
    }
}
