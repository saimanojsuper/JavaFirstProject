package com.Demo.thread;


public class PrintSequenceRunnable implements Runnable{

	public int PRINT_NUMBERS_UPTO=21;
	static int  number=1;
	int remainder;
	static Object lock=new Object();

	PrintSequenceRunnable(int remainder)
	{
		this.remainder=remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO-1) {
			synchronized (lock) {
				while (number % 2 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				
				System.out.print(Thread.currentThread().getName() + " ");
				if(number % 2 == 0) {
					System.out.println();
				}
				
				number++;
				lock.notifyAll();
			}
		}
	}
}
