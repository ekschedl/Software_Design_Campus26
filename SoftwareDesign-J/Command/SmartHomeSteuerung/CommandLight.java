package Command.SmartHomeSteuerung;

public class CommandLight implements CommandInterface{
    private Device device;

    public CommandLight(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
