package com.basics1;

public class Arrays {
public static void main(String[] args) {
	
	int []numbers= {10,20,30};
	
	//Iteration
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	
	
	//Arrays of Strings
	String []fruits= {"Apple", "Banana"};
	
	for (String names : fruits) {
		System.out.println(names);
	}
	
	
}
}
