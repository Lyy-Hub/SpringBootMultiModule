package org.zy.ones.manager.common;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.zy.ones.manager.common.result.Result;
import org.zy.ones.manager.common.result.ResultResponse;
import org.zy.ones.manager.util.HttpContextUtil;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xiangtw
 * @date 2021年12月10日 15:11
 * description:
 */
@Slf4j
@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {
    public static final String RESPONSE_RESULT_ANN = "RESPONSE-RESULT-ANN";

    /**
     * 
     * @author xiangtw
     * @date 2021/12/10 15:47
     * @param returnType
     * @param converterType 
     * @return boolean 此处如果返回false , 则不执行当前Advice的业务
     * 是否请求包含了包装注解 标记，没有直接返回不需要重写返回体，
     */
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        HttpServletRequest request = HttpContextUtil.getRequest();
        //判断请求是否有包装标志
        ResponseResult responseResult = (ResponseResult)request.getAttribute(RESPONSE_RESULT_ANN);
        return responseResult == null ? false : true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof Result) {
            return body;
        } else if (body instanceof String) {
            return JSON.toJSONString(ResultResponse.success(body));
        } else {
            return ResultResponse.success(body);
        }
    }
}
