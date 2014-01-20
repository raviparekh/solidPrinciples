package DIP.SpecficManufacturingProcess;

import DIP.Abstracts.GenericManufacturingProcess;


public class SmartPhoneManufacturing extends GenericManufacturingProcess{

    @Override
    protected void assembleDevice() {
        System.out.println("Assembling Smartphone");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing Smartphone");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packing Smartphone");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing Smartphone");
    }
}
