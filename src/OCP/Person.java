package OCP;

import OCP.Controller.RemoteController;
import OCP.Devices.CableBox;
import OCP.Devices.Projector;
import OCP.Devices.SurroundSoundSystem;
import OCP.Devices.TV;
import OCP.Interfaces.Device;

public class Person {

    private RemoteController remote;

    public void grabRemoteController(RemoteController remote){
        this.remote = remote;
    }

    public void switchSelectDeviceTo(Device device){
        this.remote.setSelectedDevice(device);
    }

    public void pressTurnOff(){
        this.remote.turnOff();
    }

    public void pressTurnOn(){
        this.remote.turnOn();
    }

    public static void main(String[] args){
        Person person = new Person();
        person.grabRemoteController(new RemoteController(new TV()));
        person.pressTurnOff();
        person.pressTurnOn();
        person.switchSelectDeviceTo(new Projector());
        person.pressTurnOff();
        person.pressTurnOn();
        person.switchSelectDeviceTo(new SurroundSoundSystem());
        person.pressTurnOff();
        person.pressTurnOn();
        person.switchSelectDeviceTo(new CableBox());
        person.pressTurnOff();
        person.pressTurnOn();
    }
}
