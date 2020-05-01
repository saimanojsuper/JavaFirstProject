package com.Publicis.Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {

	private int[] arr;
	private int num;
	Scanner scan = new Scanner(System.in);

	public Int_Arr_Process() {
		this.arr = new int[10];
		this.num = 10;
		readArray();
	}

	public Int_Arr_Process(int num) {
		this.arr = new int[num];
		this.num = num;
		readArray();
	}

	public Int_Arr_Process(int[] array, int num) {

		this.arr = array;
		this.num = num;
	}

	public void readArray() {

		System.out.println("Enter numbers in the Array");
		for (int i = 0; i < num; i++)
			this.arr[i] = scan.nextInt();
	}

	public void displayArray() {
		System.out.println("Display horizontally");
		for (int i = 0; i < num; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
		System.out.println("Display Vertically");
		for (int i = 0; i < num; i++)
			System.out.println(arr[i]);
	}

	public void sortArray() {
		Arrays.sort(arr);
		// displayArray();
	}

	public void maxandMinValueOfArray() {
		sortArray();
		System.out.println("Maximum value = " + arr[num - 1]);
		System.out.println("Minimum value = " + arr[0]);
	}

	public void sumArray() {
		int sum = 0;
		for (int i = 0; i < num; i++)
			sum += arr[i];
		System.out.println("Sum of the Array elements = " + sum);

	}

	public void secondBiggestElement() {
		sortArray();
		for (int i = num - 2; i >= 0; i--) {
			if (arr[num - 1] != arr[i]) {
				System.out.println("Second Biggest element in array is = " + arr[i]);
				break;
			}

		}
	}

	public static void main(String[] args) {
		// int[] arr = { 5, 561, 65, 48 };
		// System.out.println(arr, arr.length);
		// Int_Arr_Process array = new Int_Arr_Process(arr, arr.length);
		Int_Arr_Process array = new Int_Arr_Process(3);
		array.displayArray();
		array.sortArray();
		System.out.println("Printing elements after sorting");
		array.displayArray();
		array.maxandMinValueOfArray();
		array.sumArray();
		array.secondBiggestElement();

	}

}
