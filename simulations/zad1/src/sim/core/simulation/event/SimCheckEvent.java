package sim.core.simulation.event;

import sim.core.simulation.SimCalendar;
import sim.core.simulation.SimCargo;
import sim.core.simulation.SimController;
import sim.random.SimGenerator;

public class SimCheckEvent extends SimEvent {
    public SimCheckEvent(SimController controller){
        super(controller.manager, controller, controller.cargos.getFirst().getCheckDuration());
    }

    @Override
    public void stateChange() {
        SimController controller = this.simController;
        SimCargo simCargo = controller.cargos.pop();
        System.out.println("CONTROLLER_STATE: cargos to check: " + controller.toCheck + ", cargos passed: " + controller.passed + ", cargos blocked: " + controller.blocked);
        controller.toCheck--;
        controller.mvToCheck.setValue(controller.toCheck, controller.manager.simTime());
        boolean passed = simGenerator.raw() < SimController.PASS_CHANCE;
        simCargo.getState();
        if (passed)
            new SimPassEvent(controller, simCargo);
        else
            new SimBlockEvent(controller, simCargo);
    }
}
