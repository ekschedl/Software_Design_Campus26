package Command.SmartHomeSteuerung;

public class CommandAirConditioner implements CommandInterface{
    private Device device;

    public CommandAirConditioner(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
