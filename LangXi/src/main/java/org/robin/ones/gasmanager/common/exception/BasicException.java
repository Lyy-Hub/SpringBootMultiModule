package org.robin.ones.gasmanager.common.exception;

import org.robin.ones.gasmanager.common.result.ResultCode;

/**
 * @author xiangtw
 * @date 2021年12月13日 15:02
 * description: 用户自定义异常
 */
public class BasicException extends RuntimeException{
    private Integer code;
    private String message;
    public BasicException() {
        super();
    }
    public BasicException(String message) {
        super(message);
        this.code = ResultCode.INTERNAL_SERVER_ERROR.getCode();
        this.message = message;
    }
    public BasicException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    public BasicException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }
    public BasicException(String message, Throwable cause) {
        super(message, cause);
    }
    public BasicException(Throwable cause) {
        super(cause);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
