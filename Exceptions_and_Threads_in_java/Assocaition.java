// java program to illustrate Association
// represents HAS-A relation ship

import java.io.*;

// Bank class

class Bank{
	private String name;

	Bank(String name){
		this.name = name;
	}

	public String getBankName(){
		return this.name;
	}
}

// Employee class

class Employee{
	private String name;

	Employee(String name){
		this.name = name;
	}

	public String getEmployeeName(){
		return this.name;
	}
}

// Association between both the classes in main method

class Assocaition{
	public static void main(String args[]){
		Bank b = new Bank("Axis");
		Employee e = new Employee("Shashank");

		System.out.println(e.getEmployeeName()+" is employee of "+b.getBankName());
	}
}