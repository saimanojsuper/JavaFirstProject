package com.assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class KeyRead_Line2 {
	int[] numbers = new int[100];

	public int read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.of numbers will be entered 'n'");
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		return n;
	}

	public void display(int n) {
		for (int i = 0; i < n; i++)
			System.out.println(numbers[i]);
	}

	public void sort(int n) {
		Arrays.sort(numbers);
		for (int i = 100 - n; i <= 99; i++)
			System.out.println(numbers[i]);
	}

	public int search(int num, int n) {
		for (int i = 100 - n; i <= 99; i++) {
			if (numbers[i] == num)
				return i;
		}
		return -1;
	}
}
