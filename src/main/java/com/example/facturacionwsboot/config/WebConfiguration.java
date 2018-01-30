package com.example.facturacionwsboot.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.*;
import com.example.facturacionwsboot.resources.ClienteResource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = { ClienteResource.class })
public class WebConfiguration {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		String origin = "http://localhost:9000";
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins(origin);
			}
		};
	}
}