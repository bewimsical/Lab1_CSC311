package org.example;

public class Vehicle {
    protected int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    Vehicle(int numberOfWheels, String color, float engineSize, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }
    public String getColor(){
        return this.color;
    }
    public float getEngineSize(){
        return this.engineSize;
    }
    public String getFuelType(){
        return this.fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setEngineSize(float engineSize){
        this.engineSize = engineSize;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
}
