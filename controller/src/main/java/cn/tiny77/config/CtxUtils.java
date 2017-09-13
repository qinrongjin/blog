package cn.tiny77.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class CtxUtils implements ApplicationContextAware {

	private static ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		CtxUtils.applicationContext = applicationContext;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name){
		return (T)applicationContext.getBean(name);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> T getBean(Class z){
		return (T)applicationContext.getBean(z);
	}

}
