package Activity2;

public class Car {
    private double fuelEfficiency; // Efficiency in miles per gallon
    private double fuelLevel; // Amount of fuel in the gas tank

    // Constructor to set the fuel efficiency
    public Car(double efficiency) {
        this.fuelEfficiency = efficiency;
        this.fuelLevel = 0;
    }

    // Method to simulate driving the car for a certain distance
    public void drive(double distance) {
        // Calculate the amount of fuel consumed during the drive
        double fuelConsumed = distance / fuelEfficiency;

        // Reduce the fuel level in the tank
        fuelLevel -= fuelConsumed;
    }

    // Method to get the current amount of gasoline in the fuel tank
    public double getGasInTank() {
        return fuelLevel;
    }

    // Method to add gasoline to the fuel tank
    public void addGas(double gallons) {
        fuelLevel += gallons;
    }
}
