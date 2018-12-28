package org.holen.template.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.holen.template.common.HttpResult;
import org.holen.template.domain.req.UserAuthREQ;
import org.holen.template.service.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author holen
 * @date 2018/12/11
 */
@Api("认证系统")
@RestController
public class UserAuthController {
    @Autowired
    private UserAuthService userAuthService;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    public HttpResult<String> login(@Validated UserAuthREQ userAuthREQ) {

        return userAuthService.login(userAuthREQ);
    }

    @ApiOperation("用户登出")
    @PostMapping("/logout")
    public HttpResult<String> logout() {
        return null;
    }
}
