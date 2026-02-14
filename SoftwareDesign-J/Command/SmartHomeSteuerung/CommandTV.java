package Command.SmartHomeSteuerung;

public class CommandTV implements CommandInterface{
    private Device device;

    public CommandTV(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
