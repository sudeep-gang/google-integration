package com.googleintrigation.test.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

		/**
		 * 
		 * 
		 * @return
		 */
		@Bean
		public Docket swaggerPersonApi() {
			
			Docket docket=new Docket(DocumentationType.SWAGGER_2)
					.groupName("Person")
					.select()
					.paths(regex("/api.*")).build().apiInfo(getApiInfo());
			
			return docket;
		}
		
		
		/**
		 * 
		 * @return
		 */
		public ApiInfo getApiInfo() {
			return new ApiInfo("GoogleIntriation", "Deloye project on Google server", "1.0", "https://www.google.com", "Sudeep", "license", "licenseUrl");
		}
	}

	

