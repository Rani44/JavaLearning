package com.learn.staticvaribles;

public class ToStringBasic {
	
	int id;
	String name;
	
	public ToStringBasic(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		sb.append(id).append(": ").append(name);
		return sb.toString();
		
		//return id + ": " + name; // you can use this code instead of stringbuilder code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ToStringBasic f1 = new ToStringBasic(9, "Freddy");
		ToStringBasic f2 = new ToStringBasic(7, "Softy");
		System.out.println(f1);
		System.out.println(f2);
		
	}

}
