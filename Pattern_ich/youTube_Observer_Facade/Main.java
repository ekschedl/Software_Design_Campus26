package youTube_Observer_Facade;

public class Main {
    public static void main(String[] args) {

        YouTubePlatformFacade platform =
                new YouTubePlatformFacade();

        platform.registerEmailSubscriber("Max");
        platform.registerMobileSubscriber("Anna");

        platform.uploadVideo("Gaming", "Neues Video");
        platform.uploadVideo("Doc", "Neues Doc");
    }


}
