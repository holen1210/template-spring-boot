package org.holen.template.common;

/**
 * @author lvhaolin
 * @date 2018/11/20
 */
public class HttpResult<T> {
    private boolean success;
    private String msg;
    private T data;

    public HttpResult(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public static <T> HttpResult<T> newSuceess(T data) {
        return new HttpResult<>(true, null, data);
    }

    public static <T> HttpResult<T> newFailure(String msg) {
        return new HttpResult<>(false, msg, null);
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
