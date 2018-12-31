package com.hendiaome.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAspect {

	@Before("execution(* com.hendiaome.bean.ComponentBena.foo(..))")
	public void before() {
		System.out.println("### before");
	}
}
