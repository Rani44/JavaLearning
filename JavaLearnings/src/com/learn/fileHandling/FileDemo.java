package com.learn.fileHandling;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Sample.txt");
		System.out.println("We got a file " + file);
		System.out.println("Does file exist: " + file.exists());
		

	}

}
