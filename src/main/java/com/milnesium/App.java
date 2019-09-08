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
        car.boostSpeedFactor=1.4f;
        car.boostConsumptionFactor=1.3f;
        car.internetConnection=true;
        car.dataScienceHelp=true;
        car.color="Red";
        car.plateNumber="CJ93FJJ";
        car.doorCount=3;
    }
}
