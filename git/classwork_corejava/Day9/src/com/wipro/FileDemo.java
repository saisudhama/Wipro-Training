package com.wipro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		File f = new File("src/resources/Text.txt");
		
		try (FileOutputStream fos = new FileOutputStream(f); FileInputStream fis = new FileInputStream(f)) {
			fos.write("Writing content with creation of new file".getBytes());
			
			int i;
			while((i = fis.read()) != -1)
				System.out.print((char) i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
