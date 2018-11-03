package com.openbanking.api.ng.config;

import com.openbanking.api.ng.handler.RestAuthenticationFailureHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;

//@Configuration
//@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.authenticationEntryPoint(customAuthEntryPoint());
        resources.resourceId(AuthorizationServerConfig.SERVER_RESOURCE_ID);
    }

    @Bean
    public AuthenticationEntryPoint customAuthEntryPoint(){
        return new RestAuthenticationFailureHandler();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/","/configuration/ui","/webjars/**","/swagger-ui.html","/swagger-resources/**","/configuration/security","/v2/api-docs")
                .permitAll()
                .anyRequest()
                .authenticated();
    }
}
