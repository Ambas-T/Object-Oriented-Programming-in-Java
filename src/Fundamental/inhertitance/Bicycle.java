package Fundamental.inhertitance;

public class Bicycle extends Vehicle {
    private boolean hasBell;

    public Bicycle(String make, String model, int year, boolean hasBell) {
        super(make, model, year);
        this.hasBell = hasBell;
    }

    // Bicycles don't start with an ignition, so we override the start method
    @Override
    public void start() {
        System.out.println("Starting to pedal the " + getMake() + " " + getModel());
    }

    // Bicycles don't stop with brakes in the traditional sense, so override this too
    @Override
    public void stop() {
        System.out.println("Stopping the bicycle by pedaling backwards.");
    }

    // Specific to Bicycle, ring the bell
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
        } else {
            System.out.println("This bicycle has no bell.");
        }
    }

    // Getter and Setter for hasBell
    public boolean isHasBell() {
        return hasBell;
    }

    public void setHasBell(boolean hasBell) {
        this.hasBell = hasBell;
    }
}

