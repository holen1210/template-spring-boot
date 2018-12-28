package org.holen.template.annotation.support;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.holen.template.annotation.NeedLogin;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * @author holen
 * @date 2018/12/11
 */
@Component
@Aspect
public class NeedLoginAspect {
    @Around("execution(public * org.holen.template.controller.*Controller.*(..))")
    public Object checkLogin(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        NeedLogin needLogin = signature.getMethod().getAnnotation(NeedLogin.class);
        if (needLogin == null) {
            return pjp.proceed();
        }
        doAuth();
        return pjp.proceed();
    }

    private void doAuth() {

        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes servletRequest = (ServletRequestAttributes) requestAttributes;
        HttpServletRequest request = servletRequest.getRequest();
        HttpServletResponse response = servletRequest.getResponse();

//        String sessionId = WebContextUtil.getLoginCookieValue();
//        if (StringUtils.isBlank(sessionId)) {
//            // 开发环境支持local调式
//            List<String> profiles = Arrays.asList("local", "dev");
//            if (profiles.contains(profilesActive)) {
//                sessionId = accountManage.mockLogin(response, SysConstant.AUTO_TEST_LOGIN_EMAIL);
//            } else {
//                throw new ForbidException("NULL_COOKIE");
//            }
//        }
//
//        LoginInfoDTO loginInfo = accountManage.getLoginInfo(sessionId);
//        if (loginInfo == null) {// 未登录
//            throw new ForbidException("NULL_USER");
//        }
//        WebContextUtil.setLoginInfoToLocal(toLoginUserBO(sessionId, loginInfo));
//
//        if (needAuth) {
//            accountManage.authorization(sessionId, loginInfo.getAccountUid(), loginInfo.getEmail(), request.getRequestURI());
//        }
    }
}
