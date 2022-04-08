package org.zy.ones.manager.config;

import org.zy.ones.manager.common.ResponseResultInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xiangtw
 * @date 2021年12月10日 16:30
 * description:
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Bean
    public ResponseResultInterceptor responseResultInterceptor(){
        return new ResponseResultInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(responseResultInterceptor());
    }
}
