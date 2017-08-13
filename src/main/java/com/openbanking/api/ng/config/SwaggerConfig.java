package com.openbanking.api.ng.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private Environment environment;

    @Bean
    public Docket api(ApiInfo apiInfo) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo);
    }

    @Bean
    public ApiInfo apiInfo(Contact contact) {
        return new ApiInfoBuilder()
                .title(environment.getProperty("ob.api.name"))
                .description(environment.getProperty("ob.api.description"))
                .version(environment.getProperty("ob.version"))
                .termsOfServiceUrl(environment.getProperty("ob.url"))
                .license(environment.getProperty("ob.licence"))
                .licenseUrl(environment.getProperty("ob.licence.url"))
                .contact(contact).build();
    }

    @Bean
    public Contact contact() {
        return new Contact(environment.getProperty("ob.name"), environment.getProperty("ob.url"), environment.getProperty("ob.email"));
    }
}
