package com.inheritance;

public class Application {

	public static void main(String[] args) {

		Machine machine = new Machine();
		machine.input();
		machine.speak();

		Car car = new Car();
		car.input();
		car.horn();

	}
}
