package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.domain.BeanConfiguration;
import com.spring.demo.domain.Teacher;

public class SpringDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Teacher teacher = context.getBean(Teacher.class);
		
	}

}
