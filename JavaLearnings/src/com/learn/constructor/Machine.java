package com.learn.constructor;

public class Machine {
	
	private String name;
	private int age;
	
	Machine(){
		
		
		System.out.println("Constructor 1 is running!");
		name = "Rani Venkatesh";
		
	}
	
	Machine(String name){
		
		System.out.println("Constructor 2 is running!");
		
		this.name = name;
		System.out.println("My name is " + name);
			
	}
	
	Machine(String name,int age){
		
		this(name); // this is how the this() constructor is used. This should be always in 1st line
		this.age = age;
		System.out.println("Constructor 3 is running!");
		System.out.println("My Age is " + age);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Machine m1 = new Machine();
		
		Machine m2 = new Machine("Siddharth");
		
		Machine m3 = new Machine("Siddharth",9);

	}

}
