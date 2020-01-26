package patterns.prototype.example;

public class Rectangle implements IFigure {

	private int width;
	private int height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public IFigure clone() {
		return new Rectangle(this.width, this.height);
	}

	@Override
	public void getInfo() {
		System.out.printf("Прямоугольник длиной %d и шириной %d \n", height, width);

	}

}
