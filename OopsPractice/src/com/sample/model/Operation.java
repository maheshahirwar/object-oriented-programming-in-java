package com.sample.model;

// abstraction using interface
public interface Operation {
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	
	public default void printOperation() {
		System.out.println("default method in operation..");
	}
	public static void displayMessage() {
		System.out.println("in static method in operation..");
	}
}
