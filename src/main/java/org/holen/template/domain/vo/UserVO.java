package org.holen.template.domain.vo;

import lombok.Data;

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
    private Long phone;

}
