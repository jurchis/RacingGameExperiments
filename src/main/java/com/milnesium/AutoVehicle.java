package com.milnesium;

public class AutoVehicle extends Vehicle{

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }

    //using a has-a relationship
    Engine engine;

    //adding additional properties
    String color;
    String plateNumber;



}
