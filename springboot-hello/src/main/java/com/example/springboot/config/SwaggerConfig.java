package com.example.springboot.config;

import com.google.common.collect.Sets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig{
    @Bean
    public Docket customImplementation(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select().paths(PathSelectors.any())
//                .apis(RequestHandlerSelectors.basePackage("com.example.springboot.controller"))
//                .build()
//                .pathMapping("/");
        return new Docket(DocumentationType.SWAGGER_2)
                .protocols(Sets.newHashSet("http"))
                .apiInfo(apiInfo())
                .select().paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.example.springboot"))
                .build()
                .ignoredParameterTypes(ApiIgnore.class)
                .pathMapping("/");
    }

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API Reference")
                .version("1.0.0")
                .build();
    }
}
