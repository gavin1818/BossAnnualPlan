package com.gavincai

public class MainTest{
	public static void main(String args[]){
		int numberReport =0;
		Boss boss = new Boss();

		Employee[] employeeArray = new Employee[3];
		for(int i=0;i<employeeArray.length;i++){
			employeeArray[i]= new Employee("Employee"+Integer.toString(i));
			Thread ?? = new Thread(employeeArray[i]).start();
		}
		//the key is how to write the while loop?
		while(numberReport!=employeeArray.length){
			boss.wait();
		}
	}
}

//start() 和 wait()的关系？？