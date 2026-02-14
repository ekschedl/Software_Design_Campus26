package Ich.Strategy_Ente_me;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        System.out.println("Ente_me");
        List<Ente> entenhausen = new ArrayList<Ente>();
        entenhausen.add(new GummiEnte("GummiENte Lara"));
        entenhausen.add(new StockEnte("Stockente  Petja"));
        entenhausen.add(new Rotkopfente("Stockente  Petja"));


        for(Ente e : entenhausen){
            e.anzeigen();
            e.quaken();
            e.performFliegen();
        }
    }


}
