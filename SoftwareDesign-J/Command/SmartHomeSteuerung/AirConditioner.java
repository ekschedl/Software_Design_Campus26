package Command.SmartHomeSteuerung;

public class AirConditioner extends Device {
    @Override
    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Air Conditioner is on");
        } else {
            System.out.println("Air Conditioner is already on");
        }
    }

    @Override
    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Air Conditioner is off");
        } else {
            System.out.println("Air Conditioner is already off");
        }
    }
}
