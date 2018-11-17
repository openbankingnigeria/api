package com.openbanking.api.ng;

import static java.nio.charset.Charset.forName;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import io.github.benas.randombeans.EnhancedRandomBuilder;
import io.github.benas.randombeans.api.EnhancedRandom;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@ComponentScan
public class ApiNgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNgApplication.class, args);
	}


	@Bean
	public EnhancedRandom enhancedRandom() {
		LocalDateTime now = LocalDateTime.now();
		LocalDate minDate = now.minusDays(5).toLocalDate();
		LocalDate maxDate = now.plusDays(5).toLocalDate();
		LocalTime minTime = minDate.atStartOfDay().toLocalTime();
		LocalTime maxTime = maxDate.atStartOfDay().toLocalTime();
		return EnhancedRandomBuilder.aNewEnhancedRandomBuilder()
				.seed(123L)
				.objectPoolSize(100)
				.randomizationDepth(3)
				.charset(forName("UTF-8"))
				.timeRange(minTime, maxTime)
				.dateRange(minDate, maxDate)
				.stringLengthRange(5, 50)
				.collectionSizeRange(1, 10)
				.scanClasspathForConcreteTypes(true)
				.overrideDefaultInitialization(false)
				.build();
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}

			@Override
			public void configurePathMatch(PathMatchConfigurer configurer) {
				configurer.setUseTrailingSlashMatch(true);
			}

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addRedirectViewController("/","swagger-ui.html");
			}
		};
	}
}
