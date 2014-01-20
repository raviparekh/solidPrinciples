package OCP.Controller;


import OCP.Interfaces.Device;

public class RemoteController {
    private Device selectedDevice;

    public RemoteController(Device device){
        this.selectedDevice = device;
    }

    public void turnOff(){
        this.selectedDevice.turnOff();
    }

    public void turnOn() {
        this.selectedDevice.turnOn();
    }

    public void setSelectedDevice(Device device){
        this.selectedDevice = device;
    }
}
