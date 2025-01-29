package org.example;

public class Car extends Vehicle{
    String brand;

    Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void honk(){
        System.out.println("Honk, honk");
    }
    public void displayInfo(){
        System.out.println("Number of wheels: "+ this.numberOfWheels);
        System.out.println("Color: "+ this.color);
        System.out.println("Engine Size: "+ this.engineSize);
        System.out.println("Fuel Type: "+ this.fuelType);
        System.out.println("Brand: "+ this.brand);
    }
}
