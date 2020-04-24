package com.sapient.shapes;

public class Shapes {

	private int noOfSides;
	private int sidelength;

	public Shapes(int noOfSides, int sidelength) {

		this.noOfSides = noOfSides;
		this.sidelength = sidelength;

	}

	public void calculateShapeArea() {
		if (noOfSides == 1) {

			Circle circle = new Circle(sidelength);
			System.out.println("The area of the circle is  " + circle.calculateArea());

		} else if (noOfSides == 3) {

			Triangle triangle = new Triangle(sidelength);
			System.out.println("The area of the triangle is  " + triangle.calculateArea());

		} else if (noOfSides == 4) {

			Square square = new Square(sidelength);
			System.out.println("The area of the square is  " + square.calculateArea());
		} else {
			System.out.println("Shapes are not present");
		}
	}

}
