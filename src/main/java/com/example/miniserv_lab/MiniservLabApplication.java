package com.example.miniserv_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class MiniservLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniservLabApplication.class, args);
    }

    static class S {
        public static List<String> stass = new ArrayList<String>();
        public static List<String> vadim = new ArrayList<String>();


    }


}
