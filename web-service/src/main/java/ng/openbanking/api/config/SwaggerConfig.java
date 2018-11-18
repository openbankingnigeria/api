package ng.openbanking.api.config;

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
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
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
        return new Docket(DocumentationType.SWAGGER_2)
                //.securitySchemes(securitySchema()).securityContexts(Arrays.asList(securityContext()))
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

    private List<SecurityScheme> securitySchema() {
        LoginEndpoint loginEndpoint = new LoginEndpoint("http://localhost:8080/oauth/token");
        GrantType grantType = new ResourceOwnerPasswordCredentialsGrant("http://localhost:8080/oauth/token");
        List<SecurityScheme> schemeList = new ArrayList<>();
        List<GrantType> gTypes = new ArrayList<>();
        gTypes.add(grantType);
        List<AuthorizationScope> authorizationScopes = new ArrayList<>();
/*

        Arrays.stream(AccessScope.values()).forEach(field -> {
            authorizationScopes.add(new AuthorizationScopeBuilder().scope(field.getName()).description(field.getDescription()).build());
        });
*/

        authorizationScopes.add(new AuthorizationScopeBuilder().scope("read").build());
        authorizationScopes.add(new AuthorizationScopeBuilder().scope("write").build());


        schemeList.add(new OAuth("oauth2", authorizationScopes, gTypes));
        return schemeList;
    }

    @Bean
    public SecurityConfiguration securityInfo() {
        return new SecurityConfiguration("gigy", "secret", "", "", "", ApiKeyVehicle.HEADER, "", " ");
    }

    private SecurityContext securityContext() {
        return SecurityContext.builder().securityReferences(defaultAuth()).forPaths(PathSelectors.any()).build();
    }

    private List<SecurityReference> defaultAuth() {
        final AuthorizationScope[] authorizationScopes = new AuthorizationScope[0];
        return Arrays.asList(new SecurityReference("oauth2", authorizationScopes));
    }
}
