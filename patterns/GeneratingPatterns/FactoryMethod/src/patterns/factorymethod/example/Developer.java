package patterns.factorymethod.example;

public abstract class Developer {
	
	private String name;
	
	
	public Developer(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public abstract House create();

}
