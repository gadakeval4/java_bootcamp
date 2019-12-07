package com.basics1;

//non-public class

class Person {
	String name;
	int age;

	void speakUp() {
		name = "Raj";
		System.out.println(name);
	}

	int add() {
		int result = age + 99;
		return result;
	}
}

//1 public class
public class Class {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "Keval";
		System.out.println(p.name);
		p.speakUp();

		p.age = 4;
		System.out.println(p.add());
	}

}
