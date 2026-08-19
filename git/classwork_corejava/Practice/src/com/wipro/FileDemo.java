package com.wipro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileDemo {

	public static void main(String[] args) {
		
		String path = "src/resources/File.txt";
		
		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(path));
				BufferedReader br = new BufferedReader(new FileReader(path))) {
			bw.write("Done Write operation on new File");
			
			int i;
			while((i = br.read()) != -1)
				System.out.println((char) i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try ( ObjectOutputStream bos = new ObjectOutputStream(new FileOutputStream(path));
				ObjectInputStream bis = new ObjectInputStream(new FileInputStream(path))) {
			bos.writeObject(new Employee(1, "E1"));
			
			Employee e = (Employee) bis.readObject();
			System.out.println(e);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
