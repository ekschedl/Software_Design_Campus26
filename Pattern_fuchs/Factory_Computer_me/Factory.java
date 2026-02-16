package Factory_Computer_me;

public abstract class Factory {

    // HERE YOU CAN ADD METHODS

    public abstract Computer produziereComputer(ComputerType type);

    // DO NOT CHANGE METHOD SIGNATURE
    public Computer getComputer (ComputerType type) {

        // HERE YOU CAN ADD YOUR CODE
        Computer c;

        c= produziereComputer(type);

        if (c == null){
            System.out.println("Gibts hier nicht");
            return null;
        }
        // DO NOT CHANGE - WE WANT CLEAN COMPUTERS
        c.dust();

        return c;
    }


}
