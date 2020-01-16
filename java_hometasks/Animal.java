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
    
    public static void taskSix(){
        Cat barsik=new Cat();
          System.out.println( barsik.run(100));
          System.out.println(barsik.run(500));
          System.out.println( barsik.jump(1));
          System.out.println(barsik.jump(500));
          Dog sharik=new Dog();     
          System.out.println( sharik.run(100));
          sharik.setMaxRunDistance(600);
          System.out.println(sharik.run(500));
          System.out.println((new Animal()).run(450));
          Animal animal=(Animal)sharik;
          System.out.println(animal.run(450));
          System.out.println( sharik.jump(0.3));
          System.out.println(sharik.jump(1));
          System.out.println( sharik.swim(5));
          System.out.println(sharik.swim(500));
      }
}
