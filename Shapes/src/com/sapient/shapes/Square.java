package com.sapient.shapes;

public class Square {
	private int sides;

	public Square(int sides) {
		this.sides = sides;
	}

	public double calculateArea() {
		return sides * sides;
	}

}
