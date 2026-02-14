package Observer.FitnessTracker;

public class SmartPhone implements Geraete{

    private String name;
    private FitnessTracker fitnessTracker;

    public SmartPhone(String name, FitnessTracker fitnessTracker) {
        this.name = name;
        this.fitnessTracker = fitnessTracker;
        fitnessTracker.addGeraete(this);
    }

    @Override
    public void erhalte(Fortschritt fortschritt) {
        System.out.println("SmartPhone " +name+ " hat den Fortschritt: "+fortschritt.aktivitaet.toString()+ " erhalten");
    }

    @Override
    public String getName() {
        return name;
    }
}
