package FactoryPattern.Vehicles;

import FactoryPattern.Interfaces.Vehicle;

public class Car implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Started Car engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped Car engine");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}
