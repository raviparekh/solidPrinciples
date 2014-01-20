package OCP.Devices;

import OCP.Interfaces.Device;

public class SurroundSoundSystem implements Device {
    @Override
    public void turnOff() {
        System.out.println("SurroundSoundSystem was turned off");
    }

    @Override
    public void turnOn() {
        System.out.println("SurroundSoundSystem was turned on");
    }
}
