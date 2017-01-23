package io.disc99;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SclipApplication {

	public static void main(String[] args) {
		SpringApplication.run(SclipApplication.class, args);
	}


	@Configuration
	class Config extends WebMvcConfigurerAdapter {
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addViewController("/").setViewName("index");
		}
	}
}
