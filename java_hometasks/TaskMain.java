package java_hometasks;


public class TaskMain {

  public static void main(String[] args) {
   taskSix();
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
