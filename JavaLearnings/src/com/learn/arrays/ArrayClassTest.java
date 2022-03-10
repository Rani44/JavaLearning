package com.learn.arrays;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;

public class ArrayClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id;
		int arr[] = {1,54,22,456,33};
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int arr1[] = new int[5];
		arr1[0]=1;
		arr1[1]=10;
		arr1[2]=11;
		arr1[3]=21;
		arr1[4]=31;
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(31);
		list.add(51);
		list.add(16);
		list.add(77);
		list.add(277);
		for (int a:list) {
			System.out.println(a);
		}
		
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(21);
		list1.add(131);
		list1.add(151);
		list1.add(116);
		list1.add(277);
		list1.add(247);
		for (int b:list1) {
			System.out.println(b);
		}
		
		Hashtable<String, String> tb = new Hashtable<String, String>();
		tb.put("firstName", "Rani");
		tb.put("lastName", "Venkatesh");
		tb.put("location", "Singapore");
		
		for(Map.Entry m : tb.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
	}

}
