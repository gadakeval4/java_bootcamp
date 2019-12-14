package com.interfaces;

public class Machine implements Information {

	public int id = 7;

	public void start() {
		System.out.println("Started");
	}

	
	//From Interface
	@Override
	public void showInfo() {
		System.out.println(id);
	}

}
