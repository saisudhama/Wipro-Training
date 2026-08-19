package com.wipro;

public class GradeAllocation {

	public String gradeCheck(int marks) {

		switch (marks / 10) {
		case 10:
			return "E";
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}

}
