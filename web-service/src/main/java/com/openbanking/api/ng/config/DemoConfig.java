package com.openbanking.api.ng.config;

import ng.openbanking.api.demo.service.SandBoxTransactionService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("demo")
@ComponentScan(basePackageClasses = SandBoxTransactionService.class)
public class DemoConfig {
}
