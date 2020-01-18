package patterns.builder.example;

//abstract Builder class
public abstract class BreadBuilder {
	private Bread bread;
	
	public Bread getBread() {
		return this.bread;
	}
		
	public void createBread() {
		this.bread = new Bread();
	}
	
	public abstract void setFlour();
	
	public abstract void setSalt();
	
	public abstract void setAdditives();
}
