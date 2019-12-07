package com.basics1;

class Machine {

	int power;
	String name;

	public Machine() {
		System.out.println("Start...");
	}

	public Machine(String name, int power) {
		this();
		System.out.println(name + " " + power);
	}

}

public class Constructors {

	public static void main(String[] args) {

		// Instance Created
		Machine machine = new Machine("War-Machine", 1000);

	}

}
