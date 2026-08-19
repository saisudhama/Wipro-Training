package com.wipro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo3 {

	public static void main(String[] args) {
		
		String sourcePath = "src\\resources\\javapng.png";
		String destPath = "src\\resources\\directory";
		
		File sourceFile = new File(sourcePath);
		File destFolder = new File(destPath);
		
		File destFile = new File(destFolder, sourceFile.getName());
		
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destFile)) {
			
			byte[] byteArr = new byte[1024];
			while (fis.read(byteArr) != -1)
				fos.write(byteArr);
			
			System.out.println("Image is uploaded in: " + destFile.getAbsolutePath());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
