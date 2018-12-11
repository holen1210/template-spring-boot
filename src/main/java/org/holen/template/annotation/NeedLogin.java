package org.holen.template.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author holen
 * @date 2018/12/11
 */
@Target({METHOD})
@Retention(RUNTIME)
@Documented
public @interface NeedLogin {

}
