package org.holen.template.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.holen.template.common.HttpResult;
import org.holen.template.domain.req.user.UserCreateReq;
import org.holen.template.domain.req.user.UserQueryReq;
import org.holen.template.domain.vo.user.UserVO;
import org.holen.template.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author holen
 * @date 2018/11/20
 */
@Api(value = "用户管理")
@RestController
public class UserController {


    @Autowired
    private UserService userService;

    @ApiOperation(value = "增加用户")
    @PostMapping("/user/create")
    public HttpResult<Long> createUser(@RequestBody @Validated UserCreateReq req) {
        return null;
    }

    @ApiOperation(value = "根据Id查询用户")
    @GetMapping("/query/id")
    public HttpResult<UserVO> queryById(Long id) {
        userService.getUserById(id);
        return null;
    }

    @ApiOperation(value = "查询用户列表")
    @GetMapping("/query/list")
    public HttpResult<UserVO> list(@RequestBody @Validated UserQueryReq req) {
        userService.listUser(req);
        return null;
    }

}
