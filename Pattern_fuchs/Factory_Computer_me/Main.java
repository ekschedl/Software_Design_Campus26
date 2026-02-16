package Factory_Computer_me;

public class Main {
    public static void main(String[] args) {
        IBMFactory ibmFactory=new IBMFactory();
        AndroidFactory androidFactory=new AndroidFactory();

        System.out.println("*************ibmFactory***********");
        ibmFactory.produziereComputer(ComputerType.valueOf("TABLET"));
        ibmFactory.produziereComputer(ComputerType.valueOf("DESKTOP"));
        ibmFactory.produziereComputer(ComputerType.valueOf("SERVER"));

        System.out.println("*************androidFactory***********");
        androidFactory.produziereComputer(ComputerType.valueOf("TABLET"));
        androidFactory.produziereComputer(ComputerType.valueOf("DESKTOP"));
        androidFactory.produziereComputer(ComputerType.valueOf("SERVER"));



    }
}

