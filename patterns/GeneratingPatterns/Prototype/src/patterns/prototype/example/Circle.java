package patterns.prototype.example;

public class Circle implements IFigure {
	private int radius;
	private Point centre;

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point point) {
		this.centre = point;
	}

	public Circle(int radius, int x, int y) {
		super();
		this.radius = radius;
		this.centre = new Point(x, y);
	}

	@Override
	public IFigure clone() {

		return new Circle(this.radius, centre.getX(), centre.getY());
	}

	@Override
	public void getInfo() {
		System.out.printf("\nКруг радиусом %d \nКоординаты Х %d Y %d", radius, centre.getX(), centre.getY());
	}

}
