package DIP.DIP.Factory;

import DIP.Abstracts.GenericManufacturingProcess;
import DIP.SpecficManufacturingProcess.LaptopManufacturing;
import DIP.SpecficManufacturingProcess.SmartPhoneManufacturing;

public class DeviceFactory {
    public static void main(String[] args) {
        GenericManufacturingProcess smartPhoneManufacturer = new SmartPhoneManufacturing();
        smartPhoneManufacturer.startProcess();

        GenericManufacturingProcess laptopManufacturer = new LaptopManufacturing();
        laptopManufacturer.startProcess();
    }
}
