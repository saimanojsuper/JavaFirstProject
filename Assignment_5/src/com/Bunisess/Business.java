package com.Bunisess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.student.pojo.StudentPOJO;

public class Business {

	public static void readAndDisplay(StudentPOJO s) {
		
		System.out.println(" Student id:"+s.getId()+"\n Student name: "+s.getName()+"\n Student city: "+s.getCity());
	}
	
	public static void belongsToCity(List<StudentPOJO> students,String city) {
		
		for(StudentPOJO student:students) {
			if(student.getCity() == city) {
				readAndDisplay(student);
			}
		}
		
	}
	public static void DisplayAllStudents(List<StudentPOJO> students) {
		
		for(StudentPOJO student:students) {
				readAndDisplay(student);	
		}
	}
	public static void sortStudentsByCity(List<StudentPOJO> students) {
		Comparator<StudentPOJO> compareByCity = (StudentPOJO o1, StudentPOJO o2) -> 
        o1.getCity().compareTo( o2.getCity() );
        
        Collections.sort(students,compareByCity);
        DisplayAllStudents(students);
	}
	
	public static void sortStudentsByName(List<StudentPOJO> students) {
		Comparator<StudentPOJO> compareByName = (StudentPOJO o1, StudentPOJO o2) -> 
        o1.getName().compareTo( o2.getName() );
        
        Collections.sort(students,compareByName);
        DisplayAllStudents(students);
	}
	
   public static void displayStudentbyId(List<StudentPOJO> students,int id) {
		try {
		readAndDisplay(students.get(id));
		}
	    catch(IndexOutOfBoundsException ex){
	    	System.out.println("Student Not Found Exception");
	    }
	
	}
	
	
	public static void main(String[] args) {
		
		List<StudentPOJO> students = new ArrayList<StudentPOJO>();
		students.add(new StudentPOJO(1,"sai","chennai"));
		students.add(new StudentPOJO(2,"manoj","chennai"));
		students.add(new StudentPOJO(3,"super","banglore"));
		
		//System.out.println(students.get(0));
		//readAndDisplay(students.get(5));
		//belongsToCity(students,"chennai");
		//DisplayAllStudents(students);
		//Collections.sort(students);
		//DisplayAllStudents(students);
		
		//sortStudentsByName(students);
		

	//	DisplayAllStudents(students);
		
		displayStudentbyId(students,5);
		
	//	DisplayAllStudents(students);
        
        
	}

}
