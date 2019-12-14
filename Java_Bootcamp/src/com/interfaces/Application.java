package com.interfaces;

public class Application {
	public static void main(String[] args) {
		Machine machine = new Machine();
		Person person = new Person("BOB");

		/*
		 * machine.start(); person.greet(); System.out.println(machine.id);
		 */

		machine.showInfo();
		person.showInfo();

		System.out.println();
		
		
		
		//Advance
		Information information1 = new Machine();
		outputInfo(information1);
		
		
	}

	private static void outputInfo(Information information) {
		information.showInfo();
	}

}
