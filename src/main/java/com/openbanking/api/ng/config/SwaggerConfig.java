package com.openbanking.api.ng.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.AuthorizationScopeBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private Environment environment;


    @Bean
    public Docket api(ApiInfo apiInfo) {

        List<SecurityScheme> schemeList = new ArrayList<>();
        List<GrantType> gTypes = new ArrayList<>();
        List<AuthorizationScope> authorizationScopes = new ArrayList<>();
        Arrays.stream(AccessScope.values()).forEach(field -> {
            authorizationScopes.add(new AuthorizationScopeBuilder().scope(field.getName()).description(field.getDescription()).build());
        });

        schemeList.add(new OAuth("oAuth2", authorizationScopes, gTypes));

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo).securitySchemes(schemeList);
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
