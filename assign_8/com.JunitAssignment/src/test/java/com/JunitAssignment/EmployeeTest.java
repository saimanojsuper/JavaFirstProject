package com.JunitAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.Employee.AddEmployee;
import com.Employee.EmployeePOJO;

@RunWith(JUnitPlatform.class)
class EmployeeTest {

	EmployeePOJO emp;
	AddEmployee aemp;
	
	@BeforeEach
	public void setup() {
		emp = new EmployeePOJO(1,"sai","bang");
		aemp = new AddEmployee(emp);
	}

	@Test
	public void testaddEmplyeeMethod() {
		
		
		List<EmployeePOJO> employees = aemp.addEmployee();
		
		Assertions.assertNotNull(employees);
		Assertions.assertEquals(1, employees.size());
		
	}

	@Test
	void testgetEmplyeeIdMethod() {
		
		aemp.addEmployee();
		EmployeePOJO emp1 = aemp.getEmployee(1);
		System.out.println(emp1);
		Assertions.assertNotNull(emp1);
		
	}
}
