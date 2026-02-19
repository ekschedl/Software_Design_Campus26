package Command_SmartHomeSystems_UserEingabe;

public class MusikPlayCommand implements Command {
    private Musik musik;
    public MusikPlayCommand(Musik musik) {
        this.musik = musik;
    }

    @Override
    public void execute() {
        musik.play();
    }
}
