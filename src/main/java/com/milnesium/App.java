package com.milnesium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Engine class object
        Engine engine = new Engine();
        engine.capacity=2400;
        engine.emissions=100;
        engine.manufacturer="Toyota";
        engine.productionYear=2017;

        //Car class object
        Car car = new Car(engine);
        car.name="Supra";
        car.fuelType="Gasoline";
        car.boostSpeed=true;
        car.boostSpeedFactor=1.4f;
        car.boostConsumptionFactor=1.3f;
        car.internetConnection=true;
        car.dataScienceHelp=true;
        car.color="Red";
        car.plateNumber="CJ93FJJ";
        car.doorCount=3;

        //AutoVehicle class object
        Engine smallEngine = new Engine();

        AutoVehicle motorcycle = new AutoVehicle(smallEngine);
        motorcycle.engine = smallEngine;
        motorcycle.fuelType = "Gasoline";
        motorcycle.mileage = 7;
        motorcycle.fuelLevel = 3;
        motorcycle.boostSpeed = false;
        motorcycle.color = "Red";

        //Vehicle class object
        Vehicle dray = new Vehicle();
        dray.boostSpeed = false;
        dray.mileage = 2;
        dray.fuelType = "Horse Powered";
        dray.fuelLevel = 1;

    }
}
