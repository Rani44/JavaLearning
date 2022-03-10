package com.learn.exceptinHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		try {
		System.out.println("Enter the first no:");
		int n1 = input.nextInt();
		System.out.println("Enter the second no:");
		int n2 = input.nextInt();
		int result = n1/n2;
		System.out.println("Result is:" + result);
		} 
		/*catch (Exception e) {
			System.out.println("You can't do this");
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}*/
		catch (ArithmeticException e)
		{
			System.out.println("You can not divide the number by zero" + e);
		}
		catch (InputMismatchException e)
		{
			System.out.println("Please enter the a number " + e);
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong");
		}
		
		finally
		{
		 System.out.println("This will always prints");// This finally block will run whether the catch function found exception are run
		}
		
		//System.out.println("Rest of the program...");

	}

}
