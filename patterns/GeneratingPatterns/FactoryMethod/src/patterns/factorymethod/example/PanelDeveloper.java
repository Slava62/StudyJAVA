package patterns.factorymethod.example;

public class PanelDeveloper extends Developer {

	

	public PanelDeveloper(String name) {
		super(name);
	}

	@Override
	public House create() {
		
		 return new PanelHouse(super.getName());
	}

}
