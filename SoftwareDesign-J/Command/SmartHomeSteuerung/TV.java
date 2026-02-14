package Command.SmartHomeSteuerung;

public class TV extends Device {
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("TV is on");
        } else {
            System.out.println("TV is already on");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("TV is off");
        } else {
            System.out.println("TV is already off");
        }
    }
}
