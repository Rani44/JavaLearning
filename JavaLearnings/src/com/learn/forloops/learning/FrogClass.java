package com.learn.forloops.learning;

public class FrogClass {
	private String name;
	private int age;
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrogClass f = new FrogClass();
		f.setName("Poisonous Frog");
		f.setAge(1);
		System.out.println("Frog name is  " + f.getName() );
		System.out.println("Age of frog is " + f.getAge());		
		
		/*
		 * f.name = "Green Frog"; 
		 * f.age = 1;
		System.out.println("Frog name is  " + f.getName());
		System.out.println("Age of frog is " + f.getAge());
		*/

	}

}
