package sim.core;

import sim.core.simulation.SimCalendar;
import sim.core.simulation.SimCargo;
import sim.core.simulation.SimController;
import sim.core.simulation.event.SimCheckEvent;
import sim.core.simulation.event.SimEvent;
import sim.monitors.Diagram;

import java.util.LinkedList;

public class Manager {
    private double startSimTime = 0.0;
    private double stopSimTime = Double.MAX_VALUE;
    private double currSimTime = startSimTime;
    private boolean simulationStarted = false;
    public SimCalendar simCalendar;
    private static Manager simManager; // Singleton


    //private LinkedList<SimEvent> simEventWorkers = new LinkedList<>(); // Lista workerów, którzy są skłądowymi kroku symulacji

    public static Manager getInstance(double startSimTime) {
        if (simManager == null) {
            simManager = new Manager(startSimTime);
        }
        return simManager;
    }

    private Manager(double startSimTime) {
        if (startSimTime > 0.0)
            this.startSimTime = startSimTime;
        simCalendar = new SimCalendar();
    }

    public void registerEvent(SimEvent simEvent) {
        simCalendar.add(simEvent);
        System.out.println("EVENT_REGISTER: " + simEvent.getClass() + "; sim_time: " + simTime());
    }

    public SimEvent unregisterEvent() {
        SimEvent simEvent = simCalendar.remove();
        if (simEvent != null){
            System.out.println("EVENT_UNREGISTER: " + simEvent.getClass() + "; sim_time: " + simTime());
            return simEvent;
        }
        else
            return null;
    }

    public void nextEvent() {
        SimEvent simEventToRun = this.unregisterEvent();
        if (simEventToRun != null && simEventToRun.runTime <= this.stopSimTime){
            this.currSimTime = simEventToRun.runTime;
            simEventToRun.stateChange();
            this.nextEvent();
        }
        else
            stopSimulation();
    }

    public final void startSimulation() {
        simulationStarted = true;
        this.nextEvent();
    }

    public void setEndSimTime(double endSimTime) {
        this.stopSimTime = endSimTime;
    }
    public final double simTime() {
        return currSimTime;
    }
    public final void stopSimulation() {
        simulationStarted = false;
        System.out.println("Simulation stopped");
    }

    public static void main(String[] args) {
        int cargoValue = 100;
        LinkedList<SimCargo> simCargos = new LinkedList<>();
        for (int i = 0; i < cargoValue; i++) {
            simCargos.add(new SimCargo(i));
        }
        Manager manager = Manager.getInstance(0);
        manager.setEndSimTime(90000000);
        SimController controller = new SimController(manager, simCargos);
        new SimCheckEvent(controller);
        manager.startSimulation();
        Diagram diagram = new Diagram(Diagram.DiagramType.TIME_FUNCTION, "R-passed G-blocked B-checking");
        diagram.add(controller.mvPassed, java.awt.Color.RED);
        diagram.add(controller.mvBlocked, java.awt.Color.GREEN);
        diagram.add(controller.mvToCheck, java.awt.Color.BLUE);
        diagram.show();
    }
}