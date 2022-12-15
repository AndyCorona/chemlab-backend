package com.likezhen.chemlab.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class SpringDocConfig {
    @Bean
    public GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .pathsToMatch("/api/v1/**")
                .build();
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(info());
    }

    public Info info() {
        return new Info().title("chemlab 后端接口文档")
                .description("chemlab 是一个前后端分离的项目")
                .version("v0.1")
                .license(new License().name("Apache 2.0"));
    }
}
