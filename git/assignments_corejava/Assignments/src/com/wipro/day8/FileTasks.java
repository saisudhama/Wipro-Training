package com.wipro.day8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileTasks {

	public static void main(String[] args) {

		String dirPath = "src/resources";
		String path = dirPath + "/File1.txt";

		File f = new File(dirPath);

		if (f.mkdir())
			System.out.println("Created new dir");
		else
			System.out.println("Already existed");

		File f1 = new File(dirPath + "/dir");

		if (f1.mkdir())
			System.out.println("Created new dir");
		else
			System.out.println("Already existed");

		try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path));
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path))) {

			bos.write("Creating a dir and file with bos".getBytes());

			int i;
			while ((i = bis.read()) != -1)
				System.out.print((char) i);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//copying from one file to another file
		String filePath = "src/resources/File1.txt";
		String destPath = "src/resources/dir/Copy_File1.txt";
		
		try (FileInputStream fis = new FileInputStream(filePath); FileOutputStream fos = new FileOutputStream(destPath)) {
			byte[] arr = new byte[1024];
			
			while((fis.read(arr)) != -1)
				fos.write(arr);
			
			System.out.println("File copied to the path: " + destPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//Serialization Demo
		Employee e = new Employee(1, "Shree Ram");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			oos.writeObject(e);
			
			Employee de = (Employee) ois.readObject();
			
			System.out.println("The Employee is deserialized " + de);
		} catch (IOException | ClassNotFoundException e1) {
			e1.printStackTrace();
		}

	}

}
