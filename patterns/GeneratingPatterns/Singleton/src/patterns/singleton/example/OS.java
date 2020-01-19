package patterns.singleton.example;

public class OS {
	 private static OS instance;
	 private static Object syncRoot = new Object();
	 private String name ;
	 
	 public String getName() {
		return name;
	}

	 private void setName(String name) {
		this.name = name;
	}

		private OS(String name)
	    {
	        this.setName(name);
	    }
	 
	    public static OS getInstance(String name)
	    {
	        if (instance == null) {
	        	
	        	 synchronized (syncRoot)
	             {
	            instance = new OS(name);}
	        }  
	        return instance;
	    }
}
