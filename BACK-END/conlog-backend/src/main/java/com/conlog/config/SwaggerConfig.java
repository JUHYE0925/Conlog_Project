package com.conlog.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicAPI(){

        return GroupedOpenApi.builder()
                .group("conlog-public")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI openAPI(){

        return new OpenAPI()
                .components(new Components())
                .info(swaggerInfo());
    }

    private Info swaggerInfo(){
        return new Info()
                .title("conlog API")
                .description("Conlog Swagger 연동")
                .version("1.0.0");
    }
}
