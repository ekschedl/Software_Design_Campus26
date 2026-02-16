package Factory_Computer_loesung;

public abstract class Factory {

    abstract Computer assembleComputer(ComputerType type);


    public Computer getComputer (ComputerType type) {


        Computer c = assembleComputer(type);

        if ( c == null)
        {
            return null;
        }

        // DO NOT CHANGE - WE WANT CLEAN COMPUTERS
        c.dust();

        return c;
    }


}
