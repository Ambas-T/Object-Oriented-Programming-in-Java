package Fundamental.polymorphism;

public class TransportaionStation {
	public static void main(String[] args) {
		// Polymorphism allows us to treat all vehicles in a uniform way
		Vehicle[] vehicles = new Vehicle[] { new Car(), new Bicycle(), new Bus() };

		// Operate each type of vehicle
		for (Vehicle v : vehicles) {
			v.operate(); // The actual method called depends on the object's class
		}
	}
}
