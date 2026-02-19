package Iterator_Einkaufstasche_me;
/*
Erstellen Sie eine Klasse Artikel mit Attributen um den Namen
und die Anzahl (double) zu speichern.
Erstellen Sie eine Klasse Einkaufstasche in der Sie mehrere
Artikel speichern können. Wählen Sie selbst in welcher
Datenstruktur Sie die Artikel speichern möchten. Fügen Sie
Methoden hinzu
um einen Artikel hinzuzufügen
um einen Artikel abzurufen
Erstellen Sie einen Iterator um ein Einkaufstaschen Objekt in
einer for each Schleife verwenden zu können.
Erweiterung: next() soll Exception werfen


 */
public class Main {

    public static void main(String[] args) {

        Einkaufstasche tasche = new Einkaufstasche();

        tasche.addArtikel(new Artikel("Apfel", 2));
        tasche.addArtikel(new Artikel("Milch", 1.5));

        for (Artikel a : tasche) {
            System.out.println(a);
        }
    }
}
