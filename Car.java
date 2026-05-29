public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String make,
               String model,
               int year,
               int numberOfDoors) {

        super(make, model, year);

        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {

        if (numberOfDoors == 2 || numberOfDoors == 4) {

            this.numberOfDoors = numberOfDoors;

        } else {

            System.out.println("Cars can only have 2 or 4 doors.");
        }
    }

    public void centralLock(boolean lock) {

        if (lock) {

            System.out.println("Doors locked.");

        } else {

            System.out.println("Doors unlocked.");
        }
    }

    @Override
    public String getVehicleType() {

        return "Car";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Doors: " + numberOfDoors);
    }
}