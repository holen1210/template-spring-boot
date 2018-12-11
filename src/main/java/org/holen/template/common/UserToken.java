package org.holen.template.common;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author holen
 * @date 2018/12/11
 */
@Data
public class UserToken {
    private Integer uid;
    private String token;
    private LocalDateTime updateTime;
    private LocalDateTime expireTime;
}
