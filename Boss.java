package com.gavincai
import Java.lang.*;
public class Boss implements Runnable {
	public void run(){
		this.writeAnnualPlan();
	}
	private writeAnnualPlan(){
		System.out.println("Start to write the plan");
	}
}