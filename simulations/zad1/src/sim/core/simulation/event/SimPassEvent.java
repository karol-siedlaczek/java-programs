package sim.core.simulation.event;

import sim.core.Manager;
import sim.core.simulation.SimCalendar;
import sim.core.simulation.SimCargo;
import sim.core.simulation.SimController;
import sim.random.SimGenerator;

public class SimPassEvent extends SimEvent {
    public SimPassEvent(SimController simController, SimCargo passedCargo) {
        super(simController.manager, simController, passedCargo.getPassDuration());
        passedCargo.passed = true;
        passedCargo.getState();
    }

    @Override
    public void stateChange() {
        SimController controller = this.simController;
        if (controller.toCheck > 0) { // if cargo not checked and not passed
            controller.passed++; // increment cargo blocked value
            controller.mvPassed.setValue(controller.passed, controller.manager.simTime()); // set monitored value based on blocked value
            new SimCheckEvent(controller);
        }
    }
}
