package Observer.FitnessTracker;

public class SmartWatch implements Geraete{

    private String name;
    private FitnessTracker fitnessTracker;

    public SmartWatch(String name, FitnessTracker fitnessTracker) {
        this.name = name;
        this.fitnessTracker = fitnessTracker;
        fitnessTracker.addGeraete(this);
    }

    @Override
    public void erhalte(Fortschritt fortschritt) {
        System.out.println("SmartWatch " +name+ " hat den Fortschritt: "+fortschritt.aktivitaet.toString()+ " erhalten");
    }

    @Override
    public String getName() {
        return name;
    }
}
