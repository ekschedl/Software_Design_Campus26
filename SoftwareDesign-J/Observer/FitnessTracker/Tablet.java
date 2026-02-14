package Observer.FitnessTracker;

public class Tablet implements Geraete{

    private String name;
    private FitnessTracker fitnessTracker;

    public Tablet(String name, FitnessTracker fitnessTracker) {
        this.name = name;
        this.fitnessTracker = fitnessTracker;
        fitnessTracker.addGeraete(this);
    }

    @Override
    public void erhalte(Fortschritt fortschritt) {
        System.out.println("Tablet " +name+ " hat den Fortschritt: "+fortschritt.aktivitaet.toString()+ " erhalten");
    }

    @Override
    public String getName() {
        return name;
    }
}
