package Command_SmartHomeSystems_UserEingabe;

public class LichtAnCommand implements Command {
    private Licht licht;
    public LichtAnCommand(Licht l) {
        this.licht = l;
    }

    @Override
    public void execute() {
        licht.an();
    }
}
