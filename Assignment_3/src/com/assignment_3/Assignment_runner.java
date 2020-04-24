package com.assignment_3;

public class Assignment_runner {

	public static void main(String[] args) {

		Command_Line1 numbers = new Command_Line1();
		int n = numbers.setData();
		int[] values = new int[n];
		values = numbers.calData(n);
		numbers.displayData(values);

		KeyRead_Line2 numbers_2 = new KeyRead_Line2();
		int k = numbers_2.read();
		numbers_2.display(k);
		numbers_2.sort(k);
		int num = 5;
		System.out.println(numbers_2.search(num, k));

	}

}
