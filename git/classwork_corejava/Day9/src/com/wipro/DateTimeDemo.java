package com.wipro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(dateTime);
		
//		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("Date: dd-MM-yyyy," + " Time: " + "HH-mm-ss");
		DateTimeFormatter dTF = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(dateTime.format(dTF));

	}

}
