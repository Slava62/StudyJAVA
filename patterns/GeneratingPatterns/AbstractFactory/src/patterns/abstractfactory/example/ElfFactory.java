package patterns.abstractfactory.example;

public class ElfFactory extends HeroFactory {

	@Override
	protected Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Arbalet();
	}

	@Override
	protected Movement createMovement() {
		// TODO Auto-generated method stub
		return new FlyMovement();
	}

	@Override
	protected HeroInfo createInfo() {
		// TODO Auto-generated method stub
		return new ElfInfo();
	}

}
