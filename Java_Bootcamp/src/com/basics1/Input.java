package com.basics1;

import java.util.Scanner;

public class Input {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter Line");
	//Enter line of text
	String text=scanner.nextLine();
	
	System.out.println("You Entered "+text);
		
}
}
