package com.icodingman.resume.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfigurations {

    @Value("${swagger.enable}")
    private boolean enableSwagger;

    @Value("${swagger.version}")
    private String apiVersion;

    @Bean
    public Docket SwaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enableSwagger)
                .apiInfo(GetApiInfo())
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.icodingman.resume.controllers"))
                    .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo GetApiInfo() {
        return new ApiInfoBuilder()
                .version(apiVersion)
                .title("Resume-Generator Server")
                .description("Resume-Generator Server Api Definition")
                .build();
    }
}
