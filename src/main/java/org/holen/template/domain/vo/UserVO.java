package org.holen.template.domain.vo;

import javax.validation.constraints.NotNull;

/**
 * @author holen
 * @date 2018/11/20
 */
public class UserVO {
    @NotNull(message = "用户名不能为空")
    private String username;

    @NotNull(message = "手机号不能为空")
    private Long phone;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "username='" + username + '\'' +
                ", phone=" + phone +
                '}';
    }
}
