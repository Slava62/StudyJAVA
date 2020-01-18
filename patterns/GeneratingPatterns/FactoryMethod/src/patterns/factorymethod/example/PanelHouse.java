package patterns.factorymethod.example;

public class PanelHouse extends House {

	public PanelHouse(String developerName) {
		super(developerName);
		System.out.println("Panel house is built!");
	}
}
