package device;

public class SurroundSystem implements Device {

    public void turnOn() {
        System.out.println("Turn on surround system");
    }

    public void turnOff() {
        System.out.println("Turn off surround system");
    }

    @Override
    public String toString() {
        return "SurroundSystem";
    }
}
