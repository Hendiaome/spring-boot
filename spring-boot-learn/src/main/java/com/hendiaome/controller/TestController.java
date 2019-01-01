package com.hendiaome.controller;

import com.hendiaome.bean.TestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private TestComponent testComponent;

	@RequestMapping("testAop")
	public String testAop() {
		testComponent.foo();
		return "ok";
	}
}
