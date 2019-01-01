package com.hendiaome.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestComponent implements BeanPostProcessor {

	public TestComponent() {
		//System.out.println("### ComponentBena 构造");
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//System.out.println("### 自定义 postProcessAfterInitialization 后置");
		return bean;
	}

	public void foo() {
		System.out.println("### foor");
	}
}
