package cn.tiny77.config;

import javax.validation.Validation;
import javax.validation.Validator;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Component
public class HibernateUtils {

	@Bean("validator")
	public Validator getValidator() {
		// 校验者
		LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
		bean.setProviderClass(HibernateValidator.class);
		bean.setValidationMessageSource(CtxUtils.getBean(ReloadableResourceBundleMessageSource.class));
		return bean;
	}
	
	@Bean("messageSource")
	public ReloadableResourceBundleMessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
		source.setBasenames("classpath:resources/validateMsg.properties");
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}
	
}
