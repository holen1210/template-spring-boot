package org.holen.template.controller;

import org.holen.template.common.HttpResult;
import org.holen.template.domain.vo.UserVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.holen.template.common.HttpResult.newSuceess;

/**
 * @author holen
 * @date 2018/11/20
 */
@RestController
public class UserController {
    @PostMapping("/user/create")
    public HttpResult<UserVO> createUser(@RequestBody @Validated UserVO userVO) {
        return HttpResult.newSuceess(userVO);
    }
}
