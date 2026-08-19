package com.wipro.day4;

interface Trainee {
	void display(int data);
}

public class MethodReference {
	
	public static void displayData(int data) {
		System.out.println("Displays data " + data);
	}
	
	public void nonStaticDisplay(int data) {
		System.out.println("Display non static reference data " + data);
	}
	
	MethodReference(int data){
		System.out.println("The constructor reference to display the data " + data);
	}

	public MethodReference() {
	}

	public static void main(String[] args) {
		
		Trainee tr =MethodReference::displayData; //method reference for static 
		//we can do the same thing with non static by creating a obj of MethodReference
		
		tr.display(5);
		
		MethodReference mr = new MethodReference();
		Trainee tr1 = mr::nonStaticDisplay;
		
		tr1.display(4);
		
		Trainee tr2 = new MethodReference()::nonStaticDisplay; //anonymous way of calling a method reference 
		//since we don't know what obj is created there
		
		tr2.display(9);
		
		Trainee tr3 = MethodReference::new; //using constructor for method reference
		
		tr3.display(99);

	}

}
