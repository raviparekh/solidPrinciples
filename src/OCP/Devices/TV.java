package OCP.Devices;

import OCP.Interfaces.Device;

public class TV implements Device {
    @Override
    public void turnOff() {
        System.out.println("TV was turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("TV was turned on");
    }
}
