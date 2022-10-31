package com.spring.demo.domain;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
@Component
public class Teacher implements BeanNameAware {
	
	@Override
	public void setBeanName(String name) {
		System.out.println(name);
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("Post Construct method is called...");
	}
	
}
