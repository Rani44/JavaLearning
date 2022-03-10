package com.learn.forloops.learning;

public class ForLoopsOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int i;
		for (int i = 1; i<=100; i++) {
			if (i % 2!=0)
				System.out.println(" Odd number is " + i);
		}

		
		//System.out.println(i);// i cannot be accessed outside the 'for loop. if you want to access, declared global
	}

}
