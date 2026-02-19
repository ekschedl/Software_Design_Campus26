package Facade_KinoAbend_me;

public class Facade {



        private SubsystemA dvdPlayer;
        private SubsystemB soundSystem;

        public Facade() {
            dvdPlayer = new SubsystemA();
            soundSystem = new SubsystemB();
        }

        // einfache Methode für User
        public void filmAbspielen() {

            System.out.println("=== Home Cinema startet ===");

            dvdPlayer.einschalten();
            soundSystem.einschalten();

            dvdPlayer.filmStarten();
            soundSystem.lautstaerkeSetzen();
        }
    }