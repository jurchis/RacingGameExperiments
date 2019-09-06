package com.milnesium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Engine engine = new Engine();
        engine.capacity=2400;
        engine.emissions=100;
        engine.manufacturer="Toyota";
        engine.productionYear=2017;

        Car car = new Car(engine);
        car.name="Supra";
        car.fuelType="Gasoline";
        car.boostSpeed=true;
        car.boostSpeedFactor=2;
        car.boostConsumptionFactor=2;
        car.internetConnection=true;
        car.dataScienceHelp=true;
        car.color="Red";
        car.plateNumber="CJ93FJJ";
        car.doorCount=3;
    }
}
