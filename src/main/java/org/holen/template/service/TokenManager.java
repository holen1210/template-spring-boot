package org.holen.template.service;

import org.apache.catalina.User;
import org.apache.logging.log4j.util.Strings;
import org.holen.template.common.UserToken;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * @author holen
 * @date 2018/12/11
 */
public class TokenManager {
    private static Map<String, UserToken> tokenMap;
    private static Map<Integer, UserToken> idMap;

    public static Integer getUserUId(String token) {
        UserToken userToken = tokenMap.get(token);
        if (userToken == null) {
            return null;
        }

        if (userToken.getExpireTime().isAfter(LocalDateTime.now())) {
            idMap.remove(userToken.getUid());
            tokenMap.remove(token);
            return null;
        }
        return userToken.getUid();
    }

    public static UserToken generateUserToken(Integer uid) {
        UserToken userToken = null;
        String token = UUID.randomUUID().toString().replace("-", "");
        while (tokenMap.containsKey(token)) {
            token = UUID.randomUUID().toString().replace("-", "");
        }

        LocalDateTime update = LocalDateTime.now();
        LocalDateTime expire = update.plusDays(1);

        userToken = new UserToken();
        userToken.setToken(token);
        userToken.setUpdateTime(update);
        userToken.setExpireTime(expire);
        userToken.setUid(uid);
        tokenMap.put(token, userToken);
        idMap.put(uid, userToken);

        return userToken;
    }
}
