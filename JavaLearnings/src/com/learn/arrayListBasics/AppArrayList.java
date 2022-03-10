package com.learn.arrayListBasics;

import java.util.ArrayList;
import java.util.HashMap;

public class AppArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Before Java 5//
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add("Plum");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		//Modern sytle - use below style//
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Cat");
		list2.add("Dog");
		list2.add("Moneky");
		String animal = list2.get(0);
		System.out.println(animal);
		
		//There can be more than one type argument
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		///Java 7 Style
		ArrayList <Integer> someList = new ArrayList<Integer>();
		

	}

}
