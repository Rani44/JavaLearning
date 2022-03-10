package com.learn.staticvaribles;

public class StaticMethod {
	public String name;
	public static String description;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMethod.description = "I am a living thing";
		System.out.println(StaticMethod.description );
		
		StaticMethod s1 = new StaticMethod();
		s1.name = "Anushka";

		System.out.println(s1.name);


	}

}
