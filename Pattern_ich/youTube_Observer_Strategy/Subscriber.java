package youTube_Observer_Strategy;

public  interface Subscriber {
     String getName();

     void update(Video video);

}