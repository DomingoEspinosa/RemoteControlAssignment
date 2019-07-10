package control;

import device.Device;

public class RemoteControl {
    private Device device = null;
    private static final RemoteControl INSTANCE = new RemoteControl();

    private RemoteControl() {
    }

    public static RemoteControl getInstance() {
        return INSTANCE;
    }

    public void connectToDevice(Device device) {
        this.device = device;
        System.out.println("Connected to the device-->" + device + "<---");
    }

    public void clickTurnOn(){
        this.device.turnOn();
    }

    public void clickTurnOff(){
        this.device.turnOff();
    }

}
