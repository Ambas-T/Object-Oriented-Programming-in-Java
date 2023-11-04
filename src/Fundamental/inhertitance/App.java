package Fundamental.inhertitance;

public class App {
	public static void main(String[] args) {
		Vehicle myVehicle = new Vehicle("Generic", "Model", 2019);
		myVehicle.start(); // Outputs: Generic Model of year 2019 started
		myVehicle.stop(); // Outputs: Generic Model stopped

		Car myCar = new Car("Toyota", "Corolla", 2020, 4);
		myCar.start(); // Outputs: Toyota Corolla of year 2020 started Car with 4 doors started.
		myCar.honk(); // Outputs: Toyota Corolla honk: Beep Beep
		myCar.stop(); // Outputs: Brakes applied Toyota Corolla stopped

		ElectricCar myTesla = new ElectricCar("Tesla", "Model S", 2022, 4, 100);
		myTesla.start(); // Outputs: Electric Tesla Model S is now on with battery capacity of 100 kWh.
		myTesla.honk(); // Outputs: Tesla Model S honk: Silent Honk
		myTesla.stop(); // Outputs: Brakes applied Tesla Model S stopped

		Bicycle myBicycle = new Bicycle("Trek", "Emonda", 2021, true);
		myBicycle.start(); // Outputs: Starting to pedal the Trek Emonda
		myBicycle.ringBell(); // Outputs: Ring Ring!
		myBicycle.stop(); // Outputs: Stopping the bicycle by pedaling backwards.
	}

}
