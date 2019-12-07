package com.basics1;

import java.util.Scanner;

class Animal{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		// "this" reference to instance variable 
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class Getters_Setters {

	public static void main(String[] args) {
		
		Animal animal=new Animal();
		animal.name="Lion";
		System.out.println(animal.getName());
	
		animal.setAge(4);
		System.out.println(animal.getAge());
	}
	
}
