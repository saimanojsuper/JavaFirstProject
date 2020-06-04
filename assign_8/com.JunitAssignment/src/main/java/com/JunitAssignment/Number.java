package com.JunitAssignment;

public class Number {
	
	private int x;
	
	public int checkPrime(int x) {
		for(int i=2;i<x/2;i++) {
			if(x%i == 0)
				return 0;
		}
		return 1;
	}
	public boolean   checkAmstrong(int x) {
		   int c=0,a,temp;  
		     
		    temp=x;  
		    while(x>0)  
		    {  
		    a=x%10;  
		    x=x/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    return true;
		    else  
		    return false; 		  
		
	}
	public boolean  CheckPolindrom(int x) {
		
		  int r,sum=0,temp;    
		  int n=x;  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;    
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return true;
		  else    
		   return false;   
		}  
		
		
	}

