package com.wipro.day3.oops;

public class Hybrid_Inheritance {

	interface Car { //Hybrid Inheritance of Car with PetrolCar and ElectricCar
		//Multiple Inheritance of PetrolCar and ElectricCar with HybridCar result in Hybrid Inheritance

		int tyres = 4;

		default public void start() {
			System.out.println("Car has Started");
		}

		default public void accelerate() {
			System.out.println("Car is accelerating");
		}

	}

	interface ElectricCar extends Car {

		String type = "Electric";

		default public void chargeLevel() {
			System.out.println("Shows charging level");
		}

	}

	interface PetrolCar extends Car {

		String type = "Petrol";

		default public void fuelLevel() {
			System.out.println("Displays Petrol Level");
		}

	}
	
	final class HybridCar implements PetrolCar, ElectricCar { // Multiple Inheritance with PetrolCar and ElectricCar to HybridCar
		
		public void charge() {
			System.out.println("Can charge with either Electric or Petrol");
		}
		
	}

	public static void main(String[] args) {
		
		Hybrid_Inheritance hi = new Hybrid_Inheritance();
		HybridCar hc = hi.new HybridCar();
		
		hc.start();
		hc.chargeLevel();
		hc.fuelLevel();
		hc.charge();
		
		ElectricCar ec = new ElectricCar() {}; //Anonymous implementation
		
		ec.start();
		ec.chargeLevel();
		
		PetrolCar pc = hc; //Use HybridCar has a PetrolCar
		
		pc.accelerate();
		pc.fuelLevel();
		

	}

}
