package com.sapient.shapes;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of sides ");
		int noOfSides = scan.nextInt();
		System.out.println("Enter the length of the side");
		int sidelength = scan.nextInt();

		Shapes shape = new Shapes(noOfSides, sidelength);
		shape.calculateShapeArea();

	}

}
