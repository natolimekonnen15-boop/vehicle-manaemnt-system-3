import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Vehicle Management System ===");

        System.out.println("Choose vehicle type:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");

        int choice = input.nextInt();
        input.nextLine();

        System.out.print("Enter make: ");
        String make = input.nextLine();

        System.out.print("Enter model: ");
        String model = input.nextLine();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        Vehicle vehicle = null;

        if (choice == 1) {

            System.out.print("Enter number of doors: ");
            int doors = input.nextInt();

            vehicle = new Car(make, model, year, doors);

        } else if (choice == 2) {

            System.out.print("Enter max payload tons: ");
            double payload = input.nextDouble();

            vehicle = new Truck(make, model, year, payload);

        } else if (choice == 3) {

            input.nextLine();

            System.out.print("Enter motorcycle style: ");
            String style = input.nextLine();

            System.out.print("Has sidecar? (true/false): ");
            boolean sidecar = input.nextBoolean();

            vehicle = new Motorcycle(
                make,
                model,
                year,
                style,
                sidecar
            );

        } else {

            System.out.println("Invalid choice.");
            return;
        }

        System.out.println();

        System.out.println("Vehicle Created Successfully!");

        System.out.println(vehicle);

        System.out.println();

        vehicle.startEngine();

        vehicle.displayInfo();

        input.close();
    }
}