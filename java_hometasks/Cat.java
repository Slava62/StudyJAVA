package java_hometasks;

public class Cat {

    private Animal parent;
    private IFoodProvider foodProvider;
    private String name;
    private boolean fullness;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isFull() {
        return fullness;
    }
    public Cat() {
        this.parent = new Animal();
        this.fullness=false;
    }
    public Cat(String name) {
        this();
        this.name = name;
    }

    public void getPlate(IFoodProvider plate){
        this.foodProvider=plate;
    }
    public String toEatUp(int nessesaryQuantityOfFood) {
        if(foodProvider==null){return "The cat "+name+" has no plate";}
        if (foodProvider.getFood(nessesaryQuantityOfFood)) {
            this.fullness=true;
            return "The cat "+name+" is full";
        }
        return "The cat "+name+" is hungry";
    }
    public String run(double distance){
        return "The cat" + parent.run(distance);
    }
    public String jump(double distance){
        return "The cat" + parent.jump(distance);
    }


}
