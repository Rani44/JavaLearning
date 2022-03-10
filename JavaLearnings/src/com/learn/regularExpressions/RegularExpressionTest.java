package com.learn.regularExpressions;

import java.util.regex.Pattern;

public class RegularExpressionTest {
	public static void main(String[] args) {
	/*	\\d Any  number / digit
		\\D anything but a number
		\\s any space
		\\S anything but space
		\\w any character
		\\W anything but a charactor
		*/
		String input = "12 Main St";
		if(!Pattern.matches("\\d(1,2)\\s\\w+\\s\\w+", input)) {
			System.out.println("Address format is incorrect");
		} else
		{
			System.out.println("Address format is correct");
		}
	}
}
