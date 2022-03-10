package com.learn.readwriteFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\65838\\eclipse-workspace\\JavaLearnings\\Test.txt");
		BufferedReader br=null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			
			
			while((line = br.readLine())!=null) {
			System.out.println(line);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found: " + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file: " + file.toString());
		}
		finally {
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to close the file: " + file.toString());
		} catch (NullPointerException ex) {
			System.out.println("File was probably never opened!");
		}
		}

	}

}
