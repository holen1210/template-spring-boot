package org.holen.template.domain.req;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author holen
 * @date 2018/12/11
 */
@Data
public class UserAuthREQ {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "用户密码不能为空")
    private String password;
}
