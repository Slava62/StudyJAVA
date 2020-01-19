package patterns.abstractfactory.example;

public class Hero {
		private HeroInfo heroinfo;
	 	private Weapon weapon;
	    private Movement movement;
	    
	    public Hero(HeroFactory factory)
	    {
	    	heroinfo = factory.createInfo();
	        weapon = factory.createWeapon();
	        movement = factory.createMovement();
	    }
	    
	    public void run()
	    {
	        movement.move();
	    }
	    public void hit()
	    {
	        weapon.hit();
	    }

		public void getInfo() {
			heroinfo.getInfo();	
		}
}
