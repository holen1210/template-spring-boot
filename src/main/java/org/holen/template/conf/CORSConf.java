package org.holen.template.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by hzweikaiqiang on 2017/5/22.
 */
@Configuration
public class CORSConf {

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // 本地调试需要增加跨域配置
                if ("local".equals(activeProfile) || "dev".equals(activeProfile)) {
                    registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*");
                }
            }
        };
    }
}
