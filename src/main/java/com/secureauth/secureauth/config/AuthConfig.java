package com.secureauth.secureauth.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AuthConfig implements WebMvcConfigurer {

        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/home").setViewName("home");
            registry.addViewController("/").setViewName("home");
            registry.addViewController("/greeting").setViewName("greeting");
            registry.addViewController("/login").setViewName("login");

        }

}
