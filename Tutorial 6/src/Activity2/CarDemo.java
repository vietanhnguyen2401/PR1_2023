package Activity2;

import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the car's fuel efficiency (miles per gallon): ");
        double fuelEfficiency = scanner.nextDouble();

        Car myCar = new Car(fuelEfficiency);

        System.out.print("Enter the initial amount of gas in the tank (gallons): ");
        double initialGas = scanner.nextDouble();
        myCar.addGas(initialGas);

        System.out.print("Enter the distance to drive (miles): ");
        double distance = scanner.nextDouble();
        myCar.drive(distance);

        double gasLeft = myCar.getGasInTank();

        System.out.println("Remaining gas in the tank: " + gasLeft + " gallons");
        scanner.close();
    }
}

