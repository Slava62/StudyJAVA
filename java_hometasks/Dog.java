package java_hometasks;

public class Dog extends Animal {
    private double max_run_distance=500;
    private final double MAX_JUMP_DISTANCE=0.5;
    public void setMaxRunDistance(double max_run_distance) {
        this.max_run_distance = max_run_distance;
    }

    @Override
    public String run(double distance) {
        if (distance > max_run_distance) {
            return "The dog has gone dead on finish" + "(" +
                    distance + "/" + max_run_distance + ")";
        }
        return "The dog ran " + distance + " m";
    }

    @Override
    public String swim(double distance) {
        return "The dog " + super.swim(distance);
    }

    @Override
    public String jump(double distance) {
        if (distance > MAX_JUMP_DISTANCE) {
            return "The dog jumped higher than the fleas" + "(" +
                    distance + "/" + MAX_JUMP_DISTANCE + ")";
        }
        return "The dog jumped on " + distance + " m";
    }
}
