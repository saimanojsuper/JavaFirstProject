package com.Demo.thread;









public class DemoThread1 {

	public static void main(String[] args) throws InterruptedException {
		
	
				
				PrintSequenceRunnable runnable1=new PrintSequenceRunnable(1);
				PrintSequenceRunnable runnable2=new PrintSequenceRunnable(0);
				
				
				Thread t1=new Thread(runnable1,"tic");
				Thread t2=new Thread(runnable2,"tok");
				
				
				t1.start();
				t2.start();
			  
			
	}

}
