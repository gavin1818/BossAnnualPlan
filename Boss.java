package com.gavincai
import Java.lang.*;
public class Boss implements Runnable {
	private CountDownLatch latch;
	public Boss(CountDownLatch latch){
		this.latch = latch;
	}
	@Override
	public void run(){
		long t = 0;
		try{
			Thread.sleep(300 + (int) (Math.random() * 2000));
			long start = System.currentTimeMillis();
			latch.await();
			t =  System.currentTimeMillis() - start;
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Boss starts to process...wait: " + t);
	}
}