package java_hometasks;

public class Animal {
    private final double MAX_RUN_DISTANCE=200;
    private final double MAX_SWIM_DISTANCE=10;
    private final double MAX_JUMP_DISTANCE=2;

    public Animal() {
    }

    public String run(double distance){
        if (distance > MAX_RUN_DISTANCE) {
            return " has gone dead on finish"+ "(" +
                    distance + "/" + MAX_RUN_DISTANCE + ")";
        }
        return " ran " + distance + " m";
    }

    public String swim(double distance){
        if (distance > MAX_SWIM_DISTANCE) {
            return " is not a fish"+ "(" +
                    distance + "/" + MAX_SWIM_DISTANCE + ")";
        }
        return " swam " + distance + "" + " m";
    }

    public String jump(double distance){
        if (distance > MAX_JUMP_DISTANCE) {
            return " jumped higher than the fleas"+ "(" +
                    distance + "/" + MAX_JUMP_DISTANCE + ")";
        }
        return " jumped on " + distance + " m";
    }
}
