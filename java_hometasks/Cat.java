package java_hometasks;

public class Cat {

    private Animal parent;
    private IPlate plate;

    public Cat() {
        this.parent = new Animal();
       
       
    }

    public String run(double distance){
        return "The cat" + parent.run(distance);
    }
    public String jump(double distance){
        return "The cat" + parent.jump(distance);
    }

}
