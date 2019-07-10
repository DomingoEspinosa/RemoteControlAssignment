package user;

import control.RemoteControl;
import device.TV;

public class Person {
    public static void main(String[] args) {
        RemoteControl remoteControl = RemoteControl.getInstance();
        TV tv = new TV();
        remoteControl.connectToDevice(tv);
        remoteControl.clickTurnOn();

    }
}
