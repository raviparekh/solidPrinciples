package FactoryPattern.Vehicles;

import FactoryPattern.Interfaces.Vehicle;

/**
 * Created by ravi on 07/10/2015.
 */
public class Van implements Vehicle{
    @Override
    public void startEngine() {
        System.out.printf("Started Van Engine");
    }

    @Override
    public void stopEngine() {
        System.out.printf("Started Van Engine");
    }

    @Override
    public void move() {
        System.out.printf("Van is moving");
    }
}
