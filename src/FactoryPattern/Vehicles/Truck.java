package FactoryPattern.Vehicles;

import FactoryPattern.Interfaces.Vehicle;

public class Truck implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Started Truck Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopped Truck Engine");
    }

    @Override
    public void move() {
        System.out.println("Truck is moving");
    }
}
