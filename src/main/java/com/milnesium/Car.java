package com.milnesium;

public class Car extends AutoVehicle {

    int doorCount;

    //additional connection of the car to the internet, connection of the driver with a data science team that
    //helps with instructions regarding speed and boost usage to better manage car resources and win the game
    boolean internetConnection;
    boolean dataScienceHelp;

    public Car(Engine engine) {
        super(engine);
    }
}
