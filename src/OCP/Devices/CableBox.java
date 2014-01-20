package OCP.Devices;

import OCP.Interfaces.Device;

public class CableBox implements Device {
    @Override
    public void turnOff() {
        System.out.println("CableBox turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("CableBox turned on");
    }
}
