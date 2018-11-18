package ng.openbanking.api.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("demo")
@ComponentScan(basePackages = "ng.openbanking.api.demo.service")
public class DemoConfig {
}
