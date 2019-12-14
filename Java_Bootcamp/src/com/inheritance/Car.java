package com.inheritance;

public class Car extends Machine {

	public void horn() {
		System.out.println("Horn");
	}

	public void honk() {
		System.out.println("Honk");
	}

	@Override
	public void input() {
		// TODO Auto-generated method stub
		// super.input();

		// access variable name from Machine
		System.out.println("HAHAHAHA " + name);
	}

}
