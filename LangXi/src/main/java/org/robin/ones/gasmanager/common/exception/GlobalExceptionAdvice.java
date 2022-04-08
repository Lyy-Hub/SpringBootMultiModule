package org.robin.ones.gasmanager.common.exception;

import org.robin.ones.gasmanager.common.result.Result;
import org.robin.ones.gasmanager.common.result.ResultCode;
import org.robin.ones.gasmanager.common.result.ResultResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.AccessDeniedException;


/**
 * @author xiangtw
 * @date 2021年12月13日 10:33
 * description: 全局异常处理
 */
@ControllerAdvice
public class GlobalExceptionAdvice {

    /**
     * 处理所有不可知的异常
     * @author xiangtw
     * @date 2021/12/13 10:39
     * @param request
     * @param e 
     * @return org.robin.ones.sanitationsupervise.common.Result
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result defaultException(HttpServletRequest request, Exception e){
        //输出堆栈信息到控制台，以后记录到日志
        e.printStackTrace();
        return ResultResponse.failure(ResultCode.INTERNAL_SERVER_ERROR);
    }
    
    /**
     * 接口无权访问异常AccessDeniedException FORBIDDEN(403, "Forbidden"),
     * @author xiangtw
     * @date 2021/12/13 10:42
     * @param e 
     * @return org.robin.ones.sanitationsupervise.common.Result
     */
    @ExceptionHandler(AccessDeniedException.class)
    @ResponseBody
    public Result accessDeniedException(AccessDeniedException e){
        e.printStackTrace();
        return ResultResponse.failure(ResultCode.FORBIDDEN);
    }

    /**
     * 处理bad请求异常
     * @author xiangtw
     * @date 2021/12/13 10:44
     * @param e 
     * @return org.robin.ones.sanitationsupervise.common.Result
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Result badRequestException(RuntimeException e) {
        e.printStackTrace();
        return ResultResponse.failure(ResultCode.BAD_REQUEST);
    }
    /**
     * 自定义异常返回
     * @author xiangtw
     * @date 2021/12/13 15:31
     * @param e
     * @return org.robin.ones.sanitationsupervise.common.result.Result
     */
    @ExceptionHandler(value = BasicException.class)
    @ResponseBody
    public Result customException(BasicException e){
        e.printStackTrace();
        return new Result().setResult(e.getCode(),e.getMessage());
    }
}
