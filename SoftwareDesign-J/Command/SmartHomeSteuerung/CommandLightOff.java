package Command.SmartHomeSteuerung;

public class CommandLightOff implements CommandInterface{
    private Device device;

    public CommandLightOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
