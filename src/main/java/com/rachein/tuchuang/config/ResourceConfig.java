package com.rachein.tuchuang.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 华南理工大学 吴远健
 * @Date 2022/9/19
 * @Description
 */
@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Value("${file.path.local}")
    private String filePath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/webjars/**").addResourceLocations(
                "classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/i/**").addResourceLocations(
                "");
    }
}
