package com.wipro;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) throws FileNotFoundException {

		String path = "src/resources/Text.txt";
		
		try (FileOutputStream fos = new FileOutputStream(path)) {
			fos.write("File Output Stream".getBytes());
		} catch (IOException e) { e.printStackTrace(); }


		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String Line;
			while ((Line = br.readLine()) != null)
				System.out.println(Line);
			
		} catch (IOException e) { e.printStackTrace(); }
		
		try (FileInputStream fis = new FileInputStream(path)) {
			int i;
			while((i = fis.read()) != -1)
				System.out.print((char) i);
		} catch (IOException e) { e.printStackTrace(); }
		
	}

}
