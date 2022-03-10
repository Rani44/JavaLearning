package com.learn.forloops.learning;

public class ForLoopsNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] colors = {{"Red", "Blue", "Green"},
							  {"Cyan", "Magenta","Turqiouse"}
							 };
		
		for (int row = 0; row < 2; row++) {
			for (int col = 0; col<3; col++) {
				System.out.print(colors[row][col] + " ");
		
			}
			System.out.println();

		}
		
		System.out.println("---------------------------------");
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j<10; j++) {
				System.out.print("Addition is  " + (i + j) + " ");

	}
			System.out.println();
		}
		
		
		System.out.println("---------------------------------");
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j<=10; j++) {
				System.out.print("Mulitplication is  " + (i * j) + " ");

	}       	System.out.println();
		}
		
		System.out.println("---------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
				System.out.println();

	}
		}
		

}
