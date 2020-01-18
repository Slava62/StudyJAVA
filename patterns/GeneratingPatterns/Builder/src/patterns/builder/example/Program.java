package patterns.builder.example;

public class Program {
	
	public static void main(String[] args)
	    {
	    
		  // create baker object
	        Baker baker = new Baker();
	        // create builder for rye bread
	        BreadBuilder builder = new RyeBreadBuilder();
	        // bake
	        Bread ryeBread = baker.bake(builder);
	        System.out.println(ryeBread.toString());
	        // create builder for wheat bread
	        builder = new WheatBreadBuilder();
	        Bread wheatBread = baker.bake(builder);
	        System.out.println(wheatBread.toString());
	        
	        Baker anotherBaker = new Baker();
	        for (int i = 0; i < 3; i++) {
	        	  System.out.println(anotherBaker.bake(new RyeBreadBuilder()).toString());
			}
	 
	    }
}
