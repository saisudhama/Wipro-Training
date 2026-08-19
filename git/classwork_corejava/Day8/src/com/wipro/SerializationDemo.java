package com.wipro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Student obj = new Student(1, "Ram");
		
		String path = "src/resources/Text.txt";
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
			oos.writeObject(obj);
			System.out.println("The object is Serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//By serializing we are converting to byte and used to transport to hibernate and store the data in file
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
			Student dObj = (Student) ois.readObject();
			System.out.println("The object is DeSerialized " + dObj);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//deserialization is converting the stream/ byte data to object data

	}

}
