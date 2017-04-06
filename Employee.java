package com.gavincai
public class Employee implements Runnable{
	private String name;
	private CountDownLatch latch;

	public Employee(String name, CountDownLatch latch) throws IllegalArgumentException{
		if (name==null) {
			throw new IllegalArgumentException("name can not be null");
		}
		this.name = name;
		this.latch = latch;
	}
	@Override
	public void run(){
		Thread t = Thread.currentThread();
		try{
			thread.sleep(300 + (int) (Math.random() * 2000));
            System.out.println(thread + name + " Employee process is done");
            latch.countDown();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}