package patterns.factorymethod.example;

public abstract class House {

	public House(String developerName) {
		super();
		this.developerName = developerName;
	}

	private String developerName;

	public String getDeveloperName() {
		return developerName;
	}	 
}
