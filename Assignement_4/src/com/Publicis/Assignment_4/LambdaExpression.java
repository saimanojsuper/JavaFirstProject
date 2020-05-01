package com.Publicis.Assignment_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Addition implements Num_Process {

	@Override
	public int cal(int c, int d) {
		Num_Process addition = (int a, int b) -> (a + b);
		// System.out.println("Addition = " + addition.cal(c, d));
		return addition.cal(c, d);
	}

}

class Subtraction implements Num_Process {

	@Override
	public int cal(int c, int d) {
		Num_Process subtraction = (int a, int b) -> (a - b);
		// System.out.println("Addition = " + subtraction.cal(c, d));
		return subtraction.cal(c, d);
	}

}

class Multiplication implements Num_Process {

	@Override
	public int cal(int c, int d) {
		Num_Process multiplication = (int a, int b) -> (a * b);
		return multiplication.cal(c, d);
	}

}

class Division implements Num_Process {

	@Override
	public int cal(int c, int d) {
		Num_Process division = (int a, int b) -> (a / b);
		// System.out.println("Addition = " + division.cal(c, d));
		return division.cal(c, d);
	}

}

public class LambdaExpression {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int c = scan.nextInt();
		int d = scan.nextInt();
		System.out.println("Enter your choice between two numbers");
		String s = scan.next();

		Map<String, Num_Process> operationMap = new HashMap<>();

		/*
		 * Map<String, Integer> numMap = new HashMap<>(); numMap.put("sai", 5);
		 * System.out.println(numMap.get("sai"));
		 */

		operationMap.put("Addition", new Addition());
		operationMap.put("Subtraction", new Subtraction());
		operationMap.put("Multiplication", new Multiplication());
		operationMap.put("Division", new Division());

		System.out.println(s + " of two numbers is " + operationMap.get(s).cal(c, d));

	}
}
