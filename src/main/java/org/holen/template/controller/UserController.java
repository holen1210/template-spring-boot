package org.holen.template.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.holen.template.common.HttpResult;
import org.holen.template.domain.vo.UserVO;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
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

    @ApiOperation(value = "增加用户", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @PostMapping("/user/create")
    public HttpResult<UserVO> createUser(@RequestBody @Validated UserVO userVO) {
        return HttpResult.newSuceess(userVO);
    }
}
