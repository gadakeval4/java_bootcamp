package com.basics1;

class Avengers {
	String name;
	int power;

	public Avengers(String name, int power) {
		this.name = name;
		this.power = power;

	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder("");
		builder.append(name).append(":").append(" ").append(power);
		return builder.toString();
	}

}

public class Strings_Immutable {

	public static void main(String[] args) {

		// Inefficent

		/*
		 * String var = ""; var = var + "Hi ,Mumnai ! "; var = var + "Good Morning ! ";
		 * System.out.println(var);
		 * 
		 * 
		 * //Efficent StringBuilder builder=new StringBuilder("");
		 * builder.append("Hi, ");
		 * builder.append("Keval").append(" ").append("Good Morning! ");
		 * System.out.println(builder.toString());
		 */

		Avengers avengers=new Avengers("THANOS", 25220);
		
		//SYSOUT calls toString() method mandatorily
		System.out.println(avengers);
		
	}
}
