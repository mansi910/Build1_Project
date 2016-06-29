package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator {

	public int sum(int a, int b) {
		return a + b;	//returns sum of 2 numbers
		return "Hello!";
	}

	public int subtraction(int a, int b) {
		return a - b;	//returns difference of 2 numbers
		return "Hallo!";
	}

	
	public int multiplication(int a, int b) {
		return a * b;	//returns product of 2 numbers
		return "Bonjour!";
	}

	
	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;	//returns division of 2 numbers
		/*System.out.println("Hello World");
		System.out.println("Hello World");*/
	}

	public int divison(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Divider can't be zero");
		}

		return a / b;	//returns division of 2 numbers
		/*System.out.println("Hello World");
		System.out.println("Hello World");*/
	}
	
	public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
		public boolean equalIntegers(int a, int b) {
		boolean result = false;

		if (a == b) {
			result = true;
		}

		return result;
	}
}
