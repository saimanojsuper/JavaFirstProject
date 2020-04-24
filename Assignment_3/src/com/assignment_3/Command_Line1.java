package com.assignment_3;

import java.util.Scanner;

public class Command_Line1 {
	int[] numbers = new int[100];

	public int setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.of numbers will be entered 'n'");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		return n;
	}

	public int[] calData(int n) {

		int[] val = new int[4];
		val[3] = numbers[0];
		for (int i = 0; i < n; i++) {
			val[0] += numbers[i];
			if (numbers[i] > val[2])
				val[2] = numbers[i];
			if (numbers[i] < val[3])
				val[3] = numbers[i];

		}
		val[1] = val[0] / n;
		return val;
	}

	public void displayData(int[] n) {
		System.out.println("Sum of the numbers is " + n[0]);
		System.out.println("Avg of the numbers is " + n[1]);
		System.out.println("Minimum value of the numbers is " + n[3]);
		System.out.println("Maximum value of the numbers is " + n[2]);

	}

}
