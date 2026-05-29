public class Truck extends Vehicle {

    private double maxPayloadTons;
    private double currentLoadTons;

    public Truck(String make,
                 String model,
                 int year,
                 double maxPayloadTons) {

        super(make, model, year);

        this.maxPayloadTons = maxPayloadTons;
        this.currentLoadTons = 0;
    }

    public double getMaxPayloadTons() {
        return maxPayloadTons;
    }

    public double getCurrentLoadTons() {
        return currentLoadTons;
    }

    public void loadCargo(double tons) {

        if (currentLoadTons + tons > maxPayloadTons) {

            System.out.println("Over capacity.");

        } else {

            currentLoadTons += tons;

            System.out.println("Loaded " + tons + " tons.");
        }
    }

    public void unloadCargo() {

        currentLoadTons = 0;

        System.out.println("Cargo unloaded.");
    }

    @Override
    public String getVehicleType() {

        return "Truck";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
            "Cargo: " +
            currentLoadTons +
            "/" +
            maxPayloadTons +
            " tons"
        );
    }
}