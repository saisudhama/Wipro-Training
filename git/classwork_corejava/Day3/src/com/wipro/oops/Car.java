package com.wipro.oops;

public class Car {

	private int _seats = 4;
	private String _color;
	private double _engineCapacity;
	private String _model;

	public Car() { // This is default Constructor
		System.out.println("This is Constructor");
	}

	public Car(int seats, String color, double engineCapacity, String model) {
		super();
		this._seats = seats;
		this._color = color;
		this._engineCapacity = engineCapacity;
		this._model = model;
	}

	public Car(String color, double engineCapacity, String model) {
		this._color = color;
		this._engineCapacity = engineCapacity;
		this._model = model;
	}

	public String get_model() {
		return _model;
	}

	public void set_model(String model) {
		this._model = model;
	}

	public int get_seats() {
		return _seats;
	}

	public void set_seats(int seats) {
		this._seats = seats;
	}

	public String get_color() {
		return _color;
	}

	public void set_color(String color) {
		this._color = color;
	}

	public double get_engineCapacity() {
		return _engineCapacity;
	}

	public void set_engineCapacity(double engineCapacity) {
		this._engineCapacity = engineCapacity;
	}

	@Override
	public String toString() {
		return "Car [seats=" + _seats + ", color=" + _color + ", engineCapacity=" + _engineCapacity + ", model="
				+ _model + "]";
	}
	
	public void overriding() {
		System.out.println("Parent Class");
	}

}
