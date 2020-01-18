package patterns.builder.example;

public class Baker {
	
	 public Bread bake(BreadBuilder breadBuilder)
	    {
	        breadBuilder.createBread();
	        breadBuilder.setFlour();
	        breadBuilder.setSalt();
	        breadBuilder.setAdditives();
	        return breadBuilder.getBread();
	    }
}
