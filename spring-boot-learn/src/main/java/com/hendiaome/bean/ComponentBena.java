package com.hendiaome.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class ComponentBena implements BeanPostProcessor {

	public ComponentBena() {
		System.out.println("### ComponentBena 构造");
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("### 自定义 postProcessAfterInitialization 后置");
		return bean;
	}
}
