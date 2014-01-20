package DIP.SpecficManufacturingProcess;

import DIP.Abstracts.GenericManufacturingProcess;

public class LaptopManufacturing extends GenericManufacturingProcess {
    @Override
    protected void assembleDevice() {
        System.out.println("Assembling laptop");
    }

    @Override
    protected void testDevice() {
        System.out.println("Testing laptop");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packing laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("Storing laptop");
    }
}
