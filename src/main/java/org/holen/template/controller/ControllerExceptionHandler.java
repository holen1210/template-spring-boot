package org.holen.template.controller;

import org.holen.template.common.HttpResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 捕获从controller抛出的异常,进行统一处理
 * @author lvhaolin
 * @date 2018/11/20
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    /**
     * 参数验证失败异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public HttpResult<String> methodArgumentValidationError(MethodArgumentNotValidException ex) {
        String msg = "参数验证失败";
        BindingResult result = ex.getBindingResult();
        if (result != null) {
            List<FieldError> errors = result.getFieldErrors();
            if (errors != null) {
                StringBuilder sb = new StringBuilder(500)
                        .append(msg).append(": ");
                for (int i = 0; i < errors.size(); i++) {
                    FieldError fieldError = errors.get(i);
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(fieldError.getDefaultMessage());
                }
                msg = sb.toString();
            }
        }
        return HttpResult.newFailure(msg);
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public HttpResult exceptionHandler(Exception ex) {
        return HttpResult.newFailure("未知错误");
    }

}
