package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.beans.HelloBean;

@Component
public class MyRunner implements CommandLineRunner {
	@Autowired
	HelloBean bean;

	@Override
	public void run(String... args) throws Exception {
		bean.hello();
		
		

	}

}
