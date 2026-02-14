package Command.SmartHomeSteuerung;

public class Light extends Device {
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Light is on");
        } else {
            System.out.println("Light is already on");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Light is off");
        } else {
            System.out.println("Light is already off");
        }
    }
}
