package Factory_Computer_me;

/*
Die Fabriken, basierend auf der Klasse Factory,
sollen anhand des Enums ComputerType,
den Sie in der Vorlage finden, neue Computer erzeugen.
 IBMFactory erstellt Desktop und Server und
 AndroidFactory erstellt Smartphone und Tablet.
 (Sonst null zurückliefern)
 */
public class AndroidFactory extends Factory {
    @Override
    public Computer produziereComputer(ComputerType type) {

        if (type == ComputerType.SMARTPHONE) {

            Smartphone s = new Smartphone();
            System.out.println("AndroidFactory: SMARTPHONE erstellt:\n" +
                    "CPU " + s.getCPU() +
                    "\nRAM " + s.getRAM() +
                    "\nHDD " + s.getHDD());
            return s;

        } else if (type == ComputerType.TABLET) {

            Tablet t = new Tablet();
            System.out.println("AndroidFactory: TABLET erstellt:\n" +
                    "CPU " + t.getCPU() +
                    "\nRAM " + t.getRAM() +
                    "\nHDD " + t.getHDD());
            return t;

        } else {

            System.out.println("Nichts erstellt, AndroidFactory erstellt nur Smartphone und Tablet");
            return null;
        }
    }

}

