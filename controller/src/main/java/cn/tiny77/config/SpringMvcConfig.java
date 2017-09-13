package cn.tiny77.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Component
public class SpringMvcConfig {

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver view = 
				new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
		return view;
	}
	
}
