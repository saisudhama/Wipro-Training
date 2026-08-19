package com.wipro.day3.oops;

public class Inheritance {

	class Car { //Hierarchical Inheritance with PetrolCar and ElectricCar
		
		int tyres = 4;
		
		Car() {
			System.out.println("This is Car");
			System.out.println();
		}
		
		public void start() {
			System.out.println("Car has Started");
		}
		
		public void accelerate() {
			System.out.println("Car is accelerating");
		}
		
	}
	
	class PetrolCar extends Car { //Single Inheritance
		
		PetrolCar() {
			super();
			System.out.println("This is PetrolCar");
			System.out.println();
		}
		
		String type = "Petrol";
		
		public void fuelLevel() {
			System.out.println("Displays Petrol Level");
		}
		
	}
	
	class ElectricCar extends Car { // Single Inheritance
		
		ElectricCar() {
			super();
			System.out.println("This is ElectriCar");
			System.out.println();
		}
		
		String type = "Electric";
		
		public void chargeLevel() {
			System.out.println("Shows charging level");
		}
		
	}
	
	class SolarCar extends ElectricCar { // Multilevel Inheritance with Car, ElectricCar and SolarCar
		
		String type = "Solar";
		
		SolarCar() {
			super();
			System.out.println("This is SolarCar");
			System.out.println();
		}
		
		public void charge() {
			System.out.println("Charges via Solar Energy");
		}
		
	}
	
	public static void main(String[] args) {
		
		Inheritance outer = new Inheritance();
		PetrolCar pc = outer.new PetrolCar();
		//need to do beacause the PetrolCar is non static inner class needs to be accessed with the outer class(Inheritance)
		
		pc.start();
		pc.accelerate();
		pc.fuelLevel();
		
		SolarCar sc = outer.new SolarCar();
		
		sc.start();
		sc.chargeLevel();
		sc.charge();

	}

}
