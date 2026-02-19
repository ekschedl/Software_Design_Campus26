package Command_SmartHomeSystems_UserEingabe;

public class Steuerkonsole_invoker {
private Command command;

    public Steuerkonsole_invoker(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
