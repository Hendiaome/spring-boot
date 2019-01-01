package com.hendiaome.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

	@After("execution(* com.hendiaome.bean.TestComponent.foo(..))")
	public void after() {
		System.out.println("### alter");
	}
}
