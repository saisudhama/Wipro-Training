package com.wipro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		
//		String path = "src/resources/TextCreate.txt";
//		
//		File f = new File(path);
//		
//		if(f.createNewFile()) //creates a new file
//			System.out.println("File " + f.getName() + " is created");
//		else
//			System.out.println("File has not created or already created");
//		
//		if(f.exists()) //Checks if file exists or not
//			System.out.println("File exists");
//		else
//			System.out.println("Doesn't exists");
		
		
		
//		String path = "src/resources/directory";
//		
//		File d = new File(path);
//		
//		if(d.mkdir()) // Create a new directory
//			System.out.println("Directory is created");
//		else
//			System.out.println("Directory is not created");
		
		
		
		
//		String path = "src/resources/TextCreate.txt";
//		
//		File f = new File(path);
//		
//		if(f.exists()) {
//			System.out.println("Length of file: " + f.length());
//			
//			if(f.delete()) //deleted the file
//				System.out.println("File deleted");
//			else
//				System.out.println("File not deleted");
//		}
//		else
//			System.out.println("File doesn't exists");
		
		
		
//		String path = "src/resources/Text.txt";
//		
//		File f = new File(path);
//		
//		FileWriter fw = new FileWriter(f);
//		BufferedWriter bw = new BufferedWriter(fw);
//		//If there is no file with that name in that path then it creates the file and writes there
//		//We can do the writing with fw also but only a limited amount than the bw
//		//and also faster than the fw
//
//		bw.write("Added New Text From Program");
//		//It overwrites the existing data with the new write
//		bw.append("\n Appended the text");
//		//With append it appends on the existing data
//		
//		System.out.println();
//		
//		bw.close();
//		fw.close();
		
		
		String path = "src/resources/Text.txt";
		
//		FileReader fr = new FileReader(path);
//		BufferedReader br = new BufferedReader(fr);
		BufferedReader br = new BufferedReader(new FileReader(path));
		
		int i;
		while((i = br.read()) != -1)
			System.out.print((char) i);
		
		String Line;
		while((Line = br.readLine()) != null)
			System.out.println(Line);
		
		br.close();
		
		
	}

}
