package com.learn.abstraction;

public interface InterfaceClassBank {
	float rateOfInterest(); // This is Abstract which doesnt have body or definition

	//Interface can have non-abstract method but with default keyword as shown
	default void message() {
		System.out.println("Message is successful");
		
	}


}
