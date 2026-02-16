package Command.SmartHomeSteuerung;

public class CommandAirConditionerOff implements CommandInterface{
    private Device device;

    public CommandAirConditionerOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
