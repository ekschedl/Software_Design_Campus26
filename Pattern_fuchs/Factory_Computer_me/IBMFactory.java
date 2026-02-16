package Factory_Computer_me;

/*
Die Fabriken, basierend auf der Klasse Factory,
sollen anhand des Enums ComputerType,
den Sie in der Vorlage finden, neue Computer erzeugen.
 IBMFactory erstellt Desktop und Server und
 AndroidFactory erstellt Smartphone und Tablet.
 (Sonst null zurückliefern)
 */
public class IBMFactory extends Factory {

    @Override
    public Computer produziereComputer(ComputerType type) {

        if (type == ComputerType.DESKTOP) {

            Desktop d = new Desktop();
            System.out.println("IBMFactory: DESKTOP erstellt:\n" +
                    "CPU " + d.getCPU() +
                    "\nRAM " + d.getRAM() +
                    "\nHDD " + d.getHDD());
            return d;

        } else if (type == ComputerType.SERVER) {

            Server s = new Server();
            System.out.println("IBMFactory: SERVER erstellt:\n" +
                    "CPU " + s.getCPU() +
                    "\nRAM " + s.getRAM() +
                    "\nHDD " + s.getHDD());
            return s;

        } else {

            System.out.println("Nichts erstellt. IBMFactory erstellt nur Desktop und Server");
            return null;
        }
    }
}

