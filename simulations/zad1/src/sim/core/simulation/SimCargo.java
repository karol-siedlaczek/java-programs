package sim.core.simulation;

import sim.random.SimGenerator;

public class SimCargo {
    int id;

    public Boolean passed = false;
    public Boolean blocked = false;
    private double duration;
    SimGenerator simGenerator;
    public SimCargo(int id) {
        this.id = id;
        simGenerator = new SimGenerator();
    }

    public void getState(){
        String preResult = "OBJ_STATE: cargo " + this.id + " has been";
        String postResult = "in " + this.duration;
        if (this.passed)
            System.out.println(preResult + " passed " + postResult);
        else if (this.blocked)
            System.out.println(preResult + " blocked " + postResult);
        else
            System.out.println(preResult + " has been checked " + postResult);
    }

    public double getPassDuration() {
        double duration = 0;
        while (duration <= 0)
            duration = simGenerator.exponential(0.4);
        this.duration = duration;
        return duration;
    }

    public double getBlockDuration() {
        double duration = 0;
        while (duration <= 0)
            duration = simGenerator.exponential(0.9);
        this.duration = duration;
        return duration;
    }

    public double getCheckDuration() {
        double duration = 0;
        while (duration <= 0)
            duration = simGenerator.exponential(0.1);
        this.duration = duration;
        return duration;
    }
}
