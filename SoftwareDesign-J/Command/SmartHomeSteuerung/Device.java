package Command.SmartHomeSteuerung;

public abstract class Device {
protected boolean isOn=false;

    public abstract void turnOn() ;
    public abstract void turnOff();
}
