package com.wipro.day4;

public class MarksException extends Exception {

	/**
	 * Warnings for the MarksException class asking to generate serial ID
	 */
	private static final long serialVersionUID = 1L;

	public MarksException(String str) {
		super(str);
		System.out.println("Marks Exception");
	}
	
	public static void checkMarks(int marks) throws MarksException {
		if(marks < 60)
			throw new MarksException("Student Failed with marks: " + marks);
		else
			System.out.println("Student Passed with marks: " + marks);
	}

	public static void main(String[] args) {
		
		try {
			checkMarks(55);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
