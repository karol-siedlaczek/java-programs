package sim.core.simulation.event;

import sim.core.simulation.SimCargo;
import sim.core.simulation.SimController;

public class SimBlockEvent extends SimEvent {
    public SimBlockEvent(SimController simController, SimCargo blockedCargo) {
        super(simController.manager, simController, blockedCargo.getBlockDuration());
        blockedCargo.blocked = true;
        blockedCargo.getState();
    }

    @Override
    public void stateChange() {
        SimController controller = this.simController;
        if (controller.toCheck > 0) { // if cargo not checked and not passed
            controller.blocked++; // increment cargo blocked value
            controller.mvBlocked.setValue(controller.blocked, controller.manager.simTime()); // set monitored value based on blocked value
            new SimCheckEvent(controller);
        }
    }
}
