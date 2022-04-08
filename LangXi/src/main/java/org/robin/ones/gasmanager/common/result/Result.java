package org.robin.ones.gasmanager.common.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xiangtw
 * @date 2021年12月10日 14:19
 * description:
 */
@Data
public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1975132012978791018L;
    private Integer code;
    private String message;
    private T data;
    public Result setResult(ResultCode resultCode) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        return this;
    }

    public Result setResult(ResultCode resultCode,T data) {
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
        this.setData(data);
        return this;
    }
    public Result setResult(Integer code,String message){
        this.code = code;
        this.message = message;
        return this;
    }
}
