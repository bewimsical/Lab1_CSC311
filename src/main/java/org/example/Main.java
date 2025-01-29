package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(2, "red", 1.5f, "regular");
        Car car = new Car(4, "blue", 2.8f,"regular", "Honda");

        System.out.println(vehicle.getNumberOfWheels());
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getEngineSize());
        System.out.println(vehicle.getFuelType());

        vehicle.setNumberOfWheels(3);
        vehicle.setColor("maroon");
        vehicle.setEngineSize(2.3f);
        vehicle.setFuelType("Super");

        System.out.println(vehicle.getNumberOfWheels());
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getEngineSize());
        System.out.println(vehicle.getFuelType());

        car.honk();
        car.displayInfo();

    }
}