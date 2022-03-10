package com.learn.staticvaribles;

public class StringBuilderBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Hi! ");
		sb.append("My name is Rani");
		sb.append(" ");
		sb.append("I am from India!").append("I am Software Engineer");
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.reverse());

	}

}
