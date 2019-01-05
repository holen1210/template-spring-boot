package org.holen.template.domain.vo.user;

import lombok.Data;
import org.holen.template.annotation.validate.Email;

import javax.validation.constraints.NotBlank;

/**
 * @author holen
 * @date 2018/11/20
 */
@Data
public class UserVO {
    @NotBlank(message = "用户名不能为空")
    private String username;

    @NotBlank(message = "手机号不能为空")
    private String phone;

    @Email
    private String email;

}
