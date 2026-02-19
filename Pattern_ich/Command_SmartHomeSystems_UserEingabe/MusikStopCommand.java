package Command_SmartHomeSystems_UserEingabe;

public class MusikStopCommand implements Command {
    private Musik musik;
    public MusikStopCommand(Musik musik) {
        this.musik = musik;
    }

    @Override
    public void execute() {
        musik.stop();
    }
}
