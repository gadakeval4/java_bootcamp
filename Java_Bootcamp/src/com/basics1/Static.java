package com.basics1;

class Thing {
	
	public String name;
	public static int age = 3;
	public final static String NAME="KEVAL";
	
	
	
	public void speak(String text) {
		this.name = text;
		System.out.println(name);
		System.out.println(age);
	}

	// Static Method
	public static void speakUp() {

//		Cant output instance variable
		// System.out.println(name);

		System.out.println(age);
	}

}

public class Static {

	public static void main(String[] args) {

		Thing thing = new Thing();
		thing.speak("AVX");
		Thing.speakUp();
		System.out.println(Thing.NAME);

	}
}
