package com.learn.abstraction;

public class SBI implements InterfaceClassBank{

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 7.64f;
	}
	
	public void add() {
		
		
	}
	
	public static void main (String args[]) {
		 SBI obj1 = new SBI();
		 obj1.rateOfInterest();
		 obj1.message();
		 System.out.println(obj1.rateOfInterest());
		
	}

}
