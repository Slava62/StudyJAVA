package java_hometasks;

public class Plate implements IFoodProvider {
    private int foodQuantityInPlate;
    private int plateCapacity;
    private Plate(){
        this.plateCapacity=1200;
        this.foodQuantityInPlate =0;
    }
    public Plate(int foodQuantityInPlate) {
        this();
        this.foodQuantityInPlate = addFood(foodQuantityInPlate);
    }
    @Override
    public String getResidue(){return  Integer.toString(foodQuantityInPlate);}

    @Override
    public boolean getFood(int quantityToGet) {
        if (foodQuantityInPlate<quantityToGet){return false;}
        foodQuantityInPlate -= quantityToGet;
        return true;
    }

    @Override
    public int addFood(int quantityToAdd) {
       if(quantityToAdd <0){return foodQuantityInPlate;}
        foodQuantityInPlate +=quantityToAdd;
       if((foodQuantityInPlate)>plateCapacity){
           foodQuantityInPlate=plateCapacity;
       }
       return foodQuantityInPlate;
    }
}
