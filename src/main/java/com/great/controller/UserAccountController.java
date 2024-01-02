package com.great.controller;


import com.great.entity.UserAccount;
import com.great.service.UserAccountService;
import com.great.utils.Urls;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户账号信息表 前端控制器
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@RestController
@RequestMapping(Urls.UserAccount.packageUrl)
@Api(tags = "用户账号信息相关接口")
public class UserAccountController {

    @Autowired
    private UserAccountService userAccountService;

    @PostMapping(Urls.UserAccount.userLogin)
    @ApiOperation(value = "用户账户登录")
    public List<UserAccount> test(){
        return userAccountService.listUserAccounts();
    }

}

