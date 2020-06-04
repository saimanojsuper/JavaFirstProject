package com.Demonstration;

public class LiskovSubstitution_addten implements NormalCalculator{

	private int num1;
	private int num2;
	
	public LiskovSubstitution_addten(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//here add method is different from the actual calculator so its done by another method
	public int add() {
		return addten();
	}
	//here the actual implementation add method takes place based on the LiskovSubstitution principle
	private int addten() {
		
		return num1+num2+10;
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
