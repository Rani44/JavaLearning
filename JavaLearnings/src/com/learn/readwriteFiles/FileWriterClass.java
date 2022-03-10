package com.learn.readwriteFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\Test.txt");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write("New line Writing 1");
			bw.newLine();
			bw.write("New line Writing 2");
			bw.newLine();
			bw.write("New line Writing 3");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}
		
		
		

	}

}
