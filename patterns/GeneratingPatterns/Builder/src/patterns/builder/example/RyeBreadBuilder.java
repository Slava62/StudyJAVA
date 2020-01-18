package patterns.builder.example;
//Builder for rye bread
public class RyeBreadBuilder extends BreadBuilder {
	

	@Override
	public void setFlour() {
		Flour flour =new Flour();
		flour.setSort("Rye flour grade 1");
		this.getBread().setFlour(flour);
		
	}

	@Override
	public void setSalt() {
		
		this.getBread().setSalt( new Salt());
		
	}

	@Override
	public void setAdditives() {
		// no use
		
	}

}
