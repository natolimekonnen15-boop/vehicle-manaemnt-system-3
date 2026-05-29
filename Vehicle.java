public abstract class Vehicle {

    private String make;
    private String model;
    private int year;
    private double fuelLevel;
    private boolean isRunning;

    public Vehicle(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;

        this.fuelLevel = 100.0;
        this.isRunning = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setFuelLevel(double fuelLevel) {

        if (fuelLevel < 0 || fuelLevel > 100) {

            System.out.println("Fuel must be between 0 and 100.");
            return;
        }

        this.fuelLevel = fuelLevel;
    }

    public void setYear(int year) {

        if (year < 1886 || year > 2025) {

            System.out.println("Invalid year.");
            return;
        }

        this.year = year;
    }

    public void startEngine() {

        if (fuelLevel <= 0) {

            System.out.println("No fuel.");
            return;
        }

        isRunning = true;

        System.out.println(make + " engine started.");
    }

    public void stopEngine() {

        isRunning = false;

        System.out.println(make + " engine stopped.");
    }

    public void refuel(double amount) {

        if (isRunning) {

            System.out.println("Stop engine before refueling.");
            return;
        }

        fuelLevel = Math.min(100, fuelLevel + amount);

        System.out.println("Refueled successfully.");
    }

    public void displayInfo() {

        System.out.println(
            year + " " + make + " " + model +
            " | Fuel: " + fuelLevel + "%"
        );
    }

    public void displayInfo(String label) {

        System.out.println(label);

        displayInfo();
    }

    public abstract String getVehicleType();

    @Override
    public String toString() {

        return year + " " + make + " " + model +
               " (" + getVehicleType() + ")";
    }
}