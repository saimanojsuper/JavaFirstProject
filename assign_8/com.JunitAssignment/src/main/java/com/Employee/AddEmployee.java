package com.Employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	
	private EmployeePOJO emp;
	List<EmployeePOJO> list = new ArrayList();
	
	public  AddEmployee(EmployeePOJO emp){
		this.emp =emp;
	}
	
	
	
	public List<EmployeePOJO> addEmployee() {
	 list.add(emp);
	 return list;
	}
	
	public EmployeePOJO getEmployee(int id) {
		for(EmployeePOJO emp:list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}
	

}
