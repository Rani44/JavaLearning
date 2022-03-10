package com.learn.fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileReader reader = new FileReader("C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\src\\com\\learn\\fileHandling\\Test.txt");
			int data = reader.read();
			while(data!=-1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
