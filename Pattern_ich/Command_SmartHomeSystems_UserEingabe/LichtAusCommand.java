package Command_SmartHomeSystems_UserEingabe;

public class LichtAusCommand implements Command {
    private Licht licht;

    public LichtAusCommand(Licht licht) {
        this.licht = licht;
    }

    @Override
    public void execute() {
        licht.aus();
    }
}
