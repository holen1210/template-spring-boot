package org.holen.template.annotation.validate.support;

import org.holen.template.annotation.validate.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author holen
 * @date 2018/12/11
 */
public class EmailValidator implements ConstraintValidator<Email, String> {
    @Override
    public void initialize(Email constraintAnnotation) {

    }

    /**
     * 具体的邮箱检验逻辑
     *
     * @param s
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        //
        //
        //
        return true;
    }
}
