package com.learn.readwriteFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String fileName = "C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\Test.txt";
		
		File f = new File(fileName);
		Scanner in = new Scanner(f);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		
		in.close();
		
		//FileReader fr = new FileReader();
		

	}

}
