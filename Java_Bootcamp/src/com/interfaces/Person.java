package com.interfaces;

public class Person implements Information {

	private String name;

	@Override
	// From Interface
	public void showInfo() {
		System.out.println(name);
	}

	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Good Morning");
	}

}
