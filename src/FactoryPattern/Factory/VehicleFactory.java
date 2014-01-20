package FactoryPattern.Factory;

import FactoryPattern.Interfaces.Vehicle;
import FactoryPattern.Vehicles.Car;
import FactoryPattern.Vehicles.Truck;
import FactoryPattern.Vehicles.Van;

public class VehicleFactory {

    public static Vehicle makeVehicle(VehicleType vehicleType){
        Vehicle selectedVehicle;
        switch (vehicleType){
            case CAR:
                selectedVehicle = new Car();
                break;
            case TRUCK:
                selectedVehicle = new Truck();
                break;
            case VAN:
                selectedVehicle =  new Van();
                break;
            default:
                throw new RuntimeException("No compatible vehicle type selected");
        }
        return selectedVehicle;
    }
}
