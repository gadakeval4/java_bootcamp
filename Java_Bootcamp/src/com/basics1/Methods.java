package com.basics1;

import java.util.Scanner;

class Employee {

	public void say(String text) {
		System.out.println("You name is  "+text);
	}
	
	public void say(String text, int age) {
		System.out.println("You name is "+text+ " and age is "+age);
	}
	
}

public class Methods {
	public static void main(String[] args) {

		Employee employee = new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		String input=sc.nextLine();
		
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		employee.say(input);
		employee.say(input, age);
	}
}
