package OCP.Devices;

import OCP.Interfaces.Device;

public class Projector implements Device {

    @Override
    public void turnOff() {
        System.out.println("Projector turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("Projector turned on");
    }
}
