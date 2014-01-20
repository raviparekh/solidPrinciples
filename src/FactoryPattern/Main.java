package FactoryPattern;

import FactoryPattern.Factory.VehicleFactory;
import FactoryPattern.Factory.VehicleType;
import FactoryPattern.Interfaces.Vehicle;


public class Main{

    public static void main(String[] args) {
        Vehicle car = VehicleFactory.makeVehicle(VehicleType.CAR);
        car.startEngine();

        Vehicle truck = VehicleFactory.makeVehicle(VehicleType.TRUCK);
        truck.startEngine();

        Vehicle van = VehicleFactory.makeVehicle(VehicleType.VAN);
        van.startEngine();

    }
}
