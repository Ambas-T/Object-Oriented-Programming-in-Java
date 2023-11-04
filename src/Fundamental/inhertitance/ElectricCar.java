package Fundamental.inhertitance;

public class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String make, String model, int year, int numberOfDoors, double batteryCapacity) {
        super(make, model, year, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding the start method to reflect an electric car's behavior
    @Override
    public void start() {
        System.out.println("Electric " + getMake() + " " + getModel() + " is now on with battery capacity of " + batteryCapacity + " kWh.");
    }

    // Overriding the honk method for an electric car
    @Override
    public void honk() {
        System.out.println(getMake() + " " + getModel() + " honk: Silent Honk");
    }

    // Getter and Setter for batteryCapacity
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

