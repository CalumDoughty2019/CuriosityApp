package org.rover.config;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

    @Value("${swagger.title}")
    private String swaggerTitle;

    @Bean
    public OpenAPI curiosityApi(){
        return new OpenAPI()
                .info(new Info()
                        .title(swaggerTitle));
    }
}
