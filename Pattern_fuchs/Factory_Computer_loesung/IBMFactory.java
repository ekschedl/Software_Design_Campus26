package Factory_Computer_loesung;


public class IBMFactory extends Factory {

    @Override
    Computer assembleComputer(ComputerType type) {
        switch(type)
        {
            case DESKTOP:
                return new Desktop();
            case SERVER:
                return new Server();
            default:
                return null;
        }
    }

}
