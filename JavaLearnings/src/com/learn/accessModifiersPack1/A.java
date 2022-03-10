package com.learn.accessModifiersPack1;

public class A {
	
	protected void method1() {
		System.out.println("Method is running within A class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		obj.method1();

	}

}
