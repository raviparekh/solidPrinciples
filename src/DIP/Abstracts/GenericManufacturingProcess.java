package DIP.Abstracts;

public abstract class GenericManufacturingProcess {

    //Template method
    //Define the general flow which applies across all concrete implementation
    public void startProcess(){
        assembleDevice();
        testDevice();
        packageDevice();
        storeDevice();
    }

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();


}
