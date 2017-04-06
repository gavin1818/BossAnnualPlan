package com.gavincai
public class Employee implements Runnable{
	private boolean submitted;
	private String name;
	public Employee(String name) throws IllegalArgumentException{
		if (name==null) {
			throw new IllegalArgumentException("name can not be null");
		}
		try{
			this.name = name;
		}catch(IllegalArgumentException e){
			System.out.println("the name is incorrect");
		}
		submitted = false;
	}
	public String getName(){
		return name;
	}
	public boolean submitted(){
		return submitted;
	}
	public void run(){
		this.giveReport();
	}
	public giveReport(){
		submitted=true;
	}
}