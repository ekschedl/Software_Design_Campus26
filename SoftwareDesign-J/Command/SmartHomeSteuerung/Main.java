package Command.SmartHomeSteuerung;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Light light=new Light();
        TV tv= new TV();
        AirConditioner airConditioner=new AirConditioner();

        RemoteControl remoteControl = new RemoteControl();

        CommandLight lightOn = new CommandLight(light);
        CommandLightOff lightOff = new CommandLightOff(light);
        CommandTV tvOn = new CommandTV(tv);
        CommandTVOff tvOff = new CommandTVOff(tv);
        CommandAirConditioner airOn = new CommandAirConditioner(airConditioner);
        CommandAirConditionerOff airOff = new CommandAirConditionerOff(airConditioner);

        remoteControl.setCommandos(1, lightOn);
        remoteControl.setCommandos(2, lightOff);
        remoteControl.setCommandos(3, tvOn);
        remoteControl.setCommandos(4, tvOff);
        remoteControl.setCommandos(5, airOn);
        remoteControl.setCommandos(6, airOff);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press  1-6 to test the Remotecontroll  (q to quit):");
        System.out.println("1:  Light On");
        System.out.println("2: Light Off");
        System.out.println("3: TV On");
        System.out.println("4: TV Off");
        System.out.println("5: Airconditioner On");
        System.out.println("6: Airconditioner Off");
        while (true) {
            String input = scanner.next();
            if (input.equals("q")) {
                remoteControl.pressButton(2);
                remoteControl.pressButton(4);
                remoteControl.pressButton(6);
                break;
            }

            try {
                int button = Integer.parseInt(input);
                remoteControl.pressButton(button);
            } catch (NumberFormatException e) {
                System.out.println("No valid Input. Enter a number or q.");
            }
        }
        scanner.close();
    }
}

