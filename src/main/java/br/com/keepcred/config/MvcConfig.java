package br.com.keepcred.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("test");
		registry.addViewController("/test").setViewName("test");
		registry.addViewController("/keepcred").setViewName("keepcred");
		registry.addViewController("/403").setViewName("403");
	}

}
