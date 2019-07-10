package device;

public class TV implements Device {
    public void turnOn() {
        System.out.println("Turn ON->TV");
    }

    public void turnOff() {
        System.out.println("Turn OF->TV");
    }

    public void changeUpChannel(){
        System.out.println("Up channel");
    }

    public void changeDownChannel(){
        System.out.println("Down channel");
    }

    @Override
    public String toString() {
        return "TV";
    }
}
