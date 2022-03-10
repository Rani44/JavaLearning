package com.learn.fileHandling;

import java.io.File;

public class FileLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\src\\com\\learn\\fileHandling\\Test.txt");
		if(file.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("File does not exists");
		}

	}

}
