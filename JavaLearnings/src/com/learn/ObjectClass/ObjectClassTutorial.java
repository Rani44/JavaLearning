package com.learn.ObjectClass;

public class ObjectClassTutorial {
	
	
	public static void checkObjectType(Object input) {
		if(input instanceof Integer) {
			//instanceof operator compares object/instance with specified Type
			System.out.println((input + " is of Integer type."));
		}
		else if(input instanceof String) {
			System.out.println(input + " is of String type.");
		}
		else if(input instanceof Float)
		{
			System.out.println(input + " is of Float type.");
		}
		else 
			System.out.println(input +" is of "+input.getClass().getTypeName()+" type.");
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkObjectType(1);
		checkObjectType(1.1f);
		checkObjectType("rani");
		checkObjectType(2.0001);
		

	}

}
