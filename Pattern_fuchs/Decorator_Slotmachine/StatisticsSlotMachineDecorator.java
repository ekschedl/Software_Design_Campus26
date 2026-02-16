package Decorator_Slotmachine;


import java.util.HashMap;
import java.util.Map;



public class StatisticsSlotMachineDecorator extends AbstractSlotMachineDecorator {

    private Map<Integer, Integer> statistics = new HashMap<Integer, Integer>();

    public StatisticsSlotMachineDecorator(ISlotMachine slotmachine) {
        super(slotmachine);
    }

    @Override
    public boolean play() {
        boolean result = super.play();
        int[] numbers = super.getLastResult();
        for (int i : numbers) {
            int count = statistics.getOrDefault(i, 0);
            count++;
            statistics.put(i, count);
        }
        return result;
    }

    public Map<Integer, Integer> getStatistics() {
        return statistics;
    }



}
