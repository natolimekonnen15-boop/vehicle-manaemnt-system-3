public class Motorcycle extends Vehicle {

    private String style;
    private boolean hasSidecar;

    public Motorcycle(String make,
                      String model,
                      int year,
                      String style,
                      boolean hasSidecar) {

        super(make, model, year);

        this.style = style;
        this.hasSidecar = hasSidecar;
    }

    public String getStyle() {
        return style;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    public void attachSidecar() {

        hasSidecar = true;

        System.out.println("Sidecar attached.");
    }

    public void removeSidecar() {

        hasSidecar = false;

        System.out.println("Sidecar removed.");
    }

    public void doWheelie() {

        if (!isRunning()) {

            System.out.println("Start engine first.");

        } else if (hasSidecar) {

            System.out.println("Cannot wheelie with sidecar.");

        } else {

            System.out.println("Wheelie!");
        }
    }

    @Override
    public String getVehicleType() {

        return "Motorcycle";
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println(
            "Style: " + style +
            " | Sidecar: " + hasSidecar
        );
    }
}