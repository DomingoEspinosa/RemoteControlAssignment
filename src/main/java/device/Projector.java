package device;

public class Projector implements Device {
    public void turnOn() {
        System.out.println("Turn On Projector");
    }

    public void turnOff() {
        System.out.println("Turn off Projector");
    }

    @Override
    public String toString() {
        return "Projector";
    }
}
