package com.wipro;

public class Computer {

	private int _ram;
	private String _model;

	public int get_ram() {
		return _ram;
	}

	public void set_ram(int ram) {
		this._ram = ram;
	}

	public String get_model() {
		return _model;
	}

	public void set_model(String model) {
		this._model = model;
	}

	@Override
	public String toString() {
		return "Computer [Ram = " + _ram + "GB" + ", Model = " + _model + "]";
	}

	public Computer(int ram, String model) {
		this._ram = ram;
		this._model = model;
	}

}
