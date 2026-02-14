package Factory.Computer;

public abstract class Factory {

    // HERE YOU CAN ADD METHODS


    // DO NOT CHANGE METHOD SIGNATURE
    public Computer getComputer (ComputerType type) {

        // HERE YOU CAN ADD YOUR CODE
        ComputerType computerType = fabricateComputer(type);
        Computer c;
        System.out.println("*** AutoTyp wird erstellt ****");
        if(computerType==null){
            return null;
        }else {
           // computerType.dust();


            System.out.println("Auto funktioniert");

            return null;
        }

    }

    protected  abstract ComputerType fabricateComputer(ComputerType orderType);
}
