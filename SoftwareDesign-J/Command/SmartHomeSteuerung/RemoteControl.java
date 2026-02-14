package Command.SmartHomeSteuerung;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    Map<Integer, CommandInterface> kommandos = new HashMap<Integer, CommandInterface>();
    public void setCommandos(Integer slot, CommandInterface commandInterface) {
        kommandos.put(slot, commandInterface);
    }
    public void pressButton(Integer button){
        if(kommandos.containsKey(button)){
            CommandInterface kommando = kommandos.get(button);
            kommando.execute();
        }

    }
}
