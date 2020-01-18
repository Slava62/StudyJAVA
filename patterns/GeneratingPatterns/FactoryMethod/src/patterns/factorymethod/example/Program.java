package patterns.factorymethod.example;

public class Program {

	public static void main(String[] args) {
		Developer dev = new PanelDeveloper("LLC Kirpichstroy");
        House panelhouse =dev.create();
        System.out.println(panelhouse.getDeveloperName());
        System.out.println("--------------------------"); 
        dev = new WoodDeveloper("Private developer");
        House woodhouse = dev.create();
        System.out.println(woodhouse.getDeveloperName());
        System.out.println("--------------------------");

	}

}
