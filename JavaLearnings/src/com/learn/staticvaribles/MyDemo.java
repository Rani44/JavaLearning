package com.learn.staticvaribles;
public class MyDemo {

	private static int i=10;
	public int j;
	
	public static void test() {
		System.out.println(i);
		i++;
		//System.out.println(j);
	}
	
	public void demo() {
		System.out.println(i);
		//System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDemo d = new MyDemo();
		test();
		d.demo();
		

	}

}
