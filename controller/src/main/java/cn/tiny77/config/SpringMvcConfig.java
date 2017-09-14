package cn.tiny77.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Component
public class SpringMvcConfig {

	@Bean
	public InternalResourceViewResolver view() {
		InternalResourceViewResolver view = 
				new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
		// 设置JSTL
		view.setViewClass(JstlView.class);
		return view;
	}
	
}
