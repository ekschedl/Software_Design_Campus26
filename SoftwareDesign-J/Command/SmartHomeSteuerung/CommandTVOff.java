package Command.SmartHomeSteuerung;

public class CommandTVOff implements CommandInterface{
    private Device device;

    public CommandTVOff(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
