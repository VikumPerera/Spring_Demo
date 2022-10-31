package com.spring.demo.domain;

public class Student implements Staff{
	public void learning() {
		System.out.println("Students are learning...");
	}

	@Override
	public void printName() {
		System.out.println("Student...");
		
	}
}
