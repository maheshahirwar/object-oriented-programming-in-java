package com.sample.model;

// abstraction and multiple inheritance
public class ArithmeticOperation implements Operation, Operation1{

	@Override
	public int div(int a, int b) {

		return a/b;
	}

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public void printOperation() {
		Operation.super.printOperation();
	}

}
