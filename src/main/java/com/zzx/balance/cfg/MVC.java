package com.zzx.balance.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Component
public class MVC implements WebMvcConfigurer{
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/","/404");
        registry.addViewController("/zzx").setViewName("test");
        registry.addViewController("/404").setViewName("404");
    }
}

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(null);
//    }
//}
