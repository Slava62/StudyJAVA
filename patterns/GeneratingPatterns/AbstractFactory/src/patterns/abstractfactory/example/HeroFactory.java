package patterns.abstractfactory.example;

public abstract class HeroFactory {
	
	protected abstract HeroInfo createInfo();
	
	protected abstract Weapon createWeapon();

	protected abstract Movement createMovement();

}
