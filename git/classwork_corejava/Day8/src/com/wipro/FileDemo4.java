package com.wipro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo4 {

	public static void main(String[] args) {
		
		String dirPath = "src/resources/dir";
		
		File d = new File(dirPath);
		
		if(d.mkdir())
			System.out.println("Dir is created");
		else
			System.out.println("Dir is not created");
		
		String filePath = dirPath + "/Text.txt";
		
		try (FileOutputStream fos = new FileOutputStream(filePath)) {
			fos.write("File Output Stream Input".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream(filePath)) {
			int i;
			while((i = fis.read()) != -1)
				System.out.print((char) i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
