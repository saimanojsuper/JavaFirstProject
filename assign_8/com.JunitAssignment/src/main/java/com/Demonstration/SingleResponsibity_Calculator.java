package com.Demonstration;

public class SingleResponsibity_Calculator implements NormalCalculator{
	
	//create simple calculator it have single responsibity as doing just basic operations like add,subract,mutiply and divide
	
	private int num1;
	private int num2;
	
	public SingleResponsibity_Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int add() {
		return num1+num2;
	}
	public int subtract() {
		return num1-num2;
	}
	public int multiply() {
		return num1*num2;
	}
	public int divide() {
		return num1/num2;
	}

}
