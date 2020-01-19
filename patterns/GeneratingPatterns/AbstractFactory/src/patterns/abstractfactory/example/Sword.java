package patterns.abstractfactory.example;

public class Sword extends Weapon {

	@Override
	protected void hit() {
		System.out.println(	"Beat with a sword");
	}

}
