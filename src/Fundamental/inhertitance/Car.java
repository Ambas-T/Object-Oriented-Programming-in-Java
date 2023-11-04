package Fundamental.inhertitance;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);  // Call the constructor of Vehicle
        this.numberOfDoors = numberOfDoors;
    }

    // A method specific to Car
    public void honk() {
        System.out.println(getMake() + " " + getModel() + " honk: Beep Beep");
    }

    @Override
    public void start() {
        // Start the car with additional behaviors
        super.start();  // Call the Vehicle's start method
        System.out.println("Car with " + numberOfDoors + " doors started.");
    }

    // Overriding the stop method with additional behavior
    @Override
    public void stop() {
        System.out.println("Brakes applied");
        super.stop();  // Call the Vehicle's stop method
    }

    // Getter and Setter for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

