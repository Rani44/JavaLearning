package com.learn.forloops.learning;

public class MethodCalling {
	
	String name;
	int age;
	
	void speak() {
		System.out.println( name + " can speak");
	}
	
	int calcYrsToRetirement() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	
	int getAge() {
		return age;
	}
	
	String getName() {
		return name;
	}
	
	String setName() {
		return name  = "Siddharth";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCalling person = new MethodCalling();
		person.name="Rani";
		person.age=39;
		
		person.speak();
		
		
		int years = person.calcYrsToRetirement();
		System.out.println("Number of years left to retire is " + years);
		
		int age = person.getAge();
		System.out.println("Current age is " + age);
		
		String name = person.getName();
		System.out.println("Current age is " + name);
		
		String name1 = person.setName();
		System.out.println("Name changed  to " + name1);

	}

}
