package sim.core.simulation.event;

import sim.core.Manager;
import sim.core.simulation.SimCalendar;
import sim.core.simulation.SimCargo;
import sim.core.simulation.SimController;
import sim.random.SimGenerator;

public abstract class SimEvent { // prototypowe zdarzenia
    public int priority = Integer.MAX_VALUE;
    public double runTime = 0.0; // czas zdarzenia
    public SimController simController;
    private Manager simManager;
    public SimGenerator simGenerator;

    public SimEvent(Manager manager, SimController simController, double delay) {
        if (manager != null) {
            simManager = manager;
            if (delay > 0.0) // register simulation in Manager
                this.runTime = simManager.simTime() + delay;
            else
                this.runTime = simManager.simTime();
            simGenerator = new SimGenerator();
            priority = simGenerator.uniformInt(0, 10);
            simManager.registerEvent(this);
            this.simController = simController;
        }
    }

    public void stateChange(){}

    public double getRunTime(){
        return this.runTime;
    }
    public int getPriority(){
        return this.priority;
    }
}
