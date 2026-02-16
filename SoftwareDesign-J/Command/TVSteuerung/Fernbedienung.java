package Command.TVSteuerung;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Fernbedienung {

    protected Map<Integer, Kommando> kommandos=new HashMap<>();
    Stack<Kommando> history=new Stack<>();

    public Fernbedienung() {
    }
    public void setKommando(Integer knopf, Kommando k) {
        kommandos.put(knopf, k);

    }

    public void knopfDruecken(Integer knopf){
        if(kommandos.containsKey(knopf)){
            Kommando k=kommandos.get(knopf);
            k.ausfuehren();
            history.push(k);
        }

    }
    public void rueckgaengigMachen(){
        if(!history.isEmpty()){

        }
    }
}
