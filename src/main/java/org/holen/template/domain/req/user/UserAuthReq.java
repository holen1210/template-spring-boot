package org.holen.template.domain.req.user;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author holen
 * @date 2018/12/11
 */
@Data
public class UserAuthReq {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "用户密码不能为空")
    private String password;
}
