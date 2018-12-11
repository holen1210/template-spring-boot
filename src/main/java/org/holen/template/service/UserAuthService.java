package org.holen.template.service;

import org.holen.template.common.HttpResult;
import org.holen.template.domain.req.UserAuthREQ;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/**
 * @author holen
 * @date 2018/12/11
 */
@Service
public class UserAuthService {
    public HttpResult<String> login(UserAuthREQ userAuthREQ) {
        String username = userAuthREQ.getUsername();
        String password = userAuthREQ.getPassword();
        // 持久化暂时省略
        //
        Integer uid = new Random().nextInt();
        String token = TokenManager.generateUserToken(uid).getToken();
        return HttpResult.newSuceess(token);
    }

    public HttpResult<String> logout() {
        return HttpResult.newSuceess("1");
    }
}
