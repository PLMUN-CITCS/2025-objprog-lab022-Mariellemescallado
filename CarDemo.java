// Car.java - Define the Car class with attributes and methods
class Car {
    // Declare instance variables (attributes)
    String make;
    String model;
    int year;

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// CarDemo.java - Main class with the main method
public class CarDemo {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car();
        
        // Assign values to the attributes of the myCar object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Call the displayInfo() method to print the car's information
        myCar.displayInfo();
    }
}
