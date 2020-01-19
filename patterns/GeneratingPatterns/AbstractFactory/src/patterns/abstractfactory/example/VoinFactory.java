package patterns.abstractfactory.example;

public class VoinFactory extends HeroFactory {

	@Override
	protected Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Sword();
	}

	@Override
	protected Movement createMovement() {
		// TODO Auto-generated method stub
		return new RunMovement();
	}

	@Override
	protected HeroInfo createInfo() {
		// TODO Auto-generated method stub
		return new VoinInfo();
	}

}
