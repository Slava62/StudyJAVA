package patterns.builder.example;

//Builder for wheat bread
public class WheatBreadBuilder extends BreadBuilder {

	@Override
	public void setFlour() {
		Flour flour =new Flour();
		flour.setSort("Wheat flour of the highest grade");
		this.getBread().setFlour(flour);
	}

	@Override
	public void setSalt() {
		this.getBread().setSalt( new Salt());
		
	}

	@Override
	public void setAdditives() {
		Additives additives =new Additives();
		additives.setName("bread improver");
		this.getBread().setAdditives(additives);
		
	}

}
