package com.learn.abstractClassExample;

public abstract class AbstractBike {

	abstract void run(); // this is abstract method. Abstract calls can have both abstract and non-abstract method
	
	void changeGear() {
		System.out.println("Gear Changed Successfully");
		
		// this is non-abstract method
		
	}
}
