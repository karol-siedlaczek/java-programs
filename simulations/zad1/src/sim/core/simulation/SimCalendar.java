package sim.core.simulation;

//import sim.core.Comparator;
import java.util.Comparator;
import sim.core.simulation.event.SimEvent;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class SimCalendar { // kalendarz zdarzen
    PriorityQueue<SimEvent> eventQueue;

    public SimCalendar() {
        this.eventQueue = new PriorityQueue<>(Comparator.comparingDouble((SimEvent o) -> o.runTime).thenComparingInt(o -> o.priority));
    }

    public void add(SimEvent simEvent) {
        eventQueue.add(simEvent);
    }

    public SimEvent remove() {
        try {
            return eventQueue.remove();
        }
        catch (NoSuchElementException e) {
            return null;
        }
    }

    public SimEvent getFirst() {
        return this.eventQueue.peek();
    }
    public int getSize() {
        return this.eventQueue.size();
    }
}
