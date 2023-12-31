package Fundamental.inhertitance;

public class Vehicle {

	private String make;
	private String model;
	private int year;

	public Vehicle(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void start() {
		System.out.println(make + " " + model + " of year " + year + " started");
	}

	public void stop() {
		System.out.println(make + " " + model + " stopped");
	}

	//Getters and Setters for encapsulation
	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
