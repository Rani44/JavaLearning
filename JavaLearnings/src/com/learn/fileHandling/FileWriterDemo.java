package com.learn.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter writer = new FileWriter("C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\src\\com\\learn\\fileHandling\\Test.txt");
			//writer.write("Roses are red \nViolets are blue \nMonkey like you should be kept in ZOO");
			writer.write("I love countries of the world - Flags");
			writer.append("\nA Poem By Siddharth");
			writer.close();
			System.out.println("File closed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
