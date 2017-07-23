package com.openbanking.api.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class ApiNgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNgApplication.class, args);
	}
}
