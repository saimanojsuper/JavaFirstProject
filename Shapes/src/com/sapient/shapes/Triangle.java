package com.sapient.shapes;

public class Triangle {
	private int sides;

	public Triangle(int sides) {
		this.sides = sides;
	}

	public double calculateArea() {
		return 0.433 * sides * sides;
	}
}
