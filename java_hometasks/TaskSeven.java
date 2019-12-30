package java_hometasks;

import java.util.Random;

public class TaskSeven {
    public static void Execute(){

        Plate  plate =new Plate(1050);
        String [] catNames={"Barsik","Kartoshka","Tom","Vaska","Murka","Shashlyk"};
        Cat [] catGroup=new Cat [catNames.length];
        Random random=new Random();
        int appetite=0; int handful=300;

        for (int i = 0; i < catNames.length; i++) {
            catGroup[i] = new Cat(catNames[i]);
            catGroup[i].getPlate(plate);
            appetite = random.nextInt(500);
            print(catGroup[i].toEatUp(
                    appetite)
                    + " (" + Integer.toString(
                    appetite) + "g)");
            while (!(catGroup[i].isFull())){
                print("Residue of food is :" + plate.getResidue() + "g");
                plate.addFood(handful);
                print("Add "+handful+"g into plate");
                print("Residue of food is :" + plate.getResidue() + "g");
                print(catGroup[i].toEatUp(
                        appetite)
                        + " (" + Integer.toString(
                        appetite) + "g)");
            }
        }
       print("Residue of food is :" + plate.getResidue() + "g");
        print("All of the cats are full!!");
    }
private static void print(String str){
        System.out.println(str);
}
}
