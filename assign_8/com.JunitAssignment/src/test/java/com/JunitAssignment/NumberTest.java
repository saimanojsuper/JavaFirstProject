package com.JunitAssignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
public class NumberTest {
	
	//@Mock
	private Number number =null;
	
    @BeforeEach
	public void setup() {
		
		 number = new Number();
	}

	@Test
	public void toCheckNumberIsPrimeOrNot() {
		
		int res = number.checkPrime(7);
		assertEquals(1,res);
	}
	@Test
	public void toCheckNumberIsArmstrongNumberOrNot() {
		
		boolean res = number.checkAmstrong(153);
	    assertEquals(true,res);
	}
	@Test
	public void toCheckNumberIsPalindromeOrNot() {
		
		boolean res = number.CheckPolindrom(121);
		assertEquals(true,res);
	}

}
