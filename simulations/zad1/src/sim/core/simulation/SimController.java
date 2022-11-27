package sim.core.simulation;

import sim.core.Manager;
import sim.core.simulation.event.SimBlockEvent;
import sim.core.simulation.event.SimCheckEvent;
import sim.core.simulation.event.SimEvent;
import sim.core.simulation.event.SimPassEvent;
import sim.monitors.MonitoredVar;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SimController {
    public static double PASS_CHANCE = 0.7;
    public int passed; // ilosc przepuszczonego towaru
    public int blocked; // ilosc zablokowanego towaru
    public int toCheck; // ilosc towaru do sprawdzenia

    public LinkedList<SimCargo> cargos;

    public Manager manager;

    public MonitoredVar mvPassed; // monitorowana zmienna - ilosc puszczonego towaru
    public MonitoredVar mvBlocked; // monitorowana zmienna - ilosc zablokowanego towaru
    public MonitoredVar mvToCheck; // monitorowana zmienna - ilosc sprawdzanego towaru

    public SimController(Manager manager, LinkedList<SimCargo> simCargos) {
        this.manager = manager;
        this.passed = 0;
        this.blocked = 0;
        this.toCheck = simCargos.size();
        this.cargos = simCargos;
        mvPassed = new MonitoredVar();
        mvBlocked = new MonitoredVar();
        mvToCheck = new MonitoredVar();
    }
}
