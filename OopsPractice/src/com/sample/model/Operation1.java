package com.sample.model;

public interface Operation1 {
	public int div(int a, int b);
	
	public default void printOperation() {
		System.out.println("default method in operation1..");
	}
	public static void displayMessage() {
		System.out.println("in static method in operation1..");
	}
}
