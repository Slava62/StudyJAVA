package patterns.prototype.example;

public class Program {

	public static void main(String[] args) {

//		Спецификаторы printf
		/*
		 * %d: для вывода целочисленных значений %x: для вывода шестнадцатеричных чисел
		 * %f: для вывода чисел с плавающей точкой %e: для вывода чисел в
		 * экспоненциальной форме, например, 1.3e+01 %c: для вывода одиночного символа
		 * %s: для вывода строковых значений
		 */
		IFigure figure = new Rectangle(30, 40);
		IFigure clonedFigure = figure.clone();
		figure.getInfo();
		clonedFigure.getInfo();

		Circle figureCircle = new Circle(30, 0, 0);
		Circle clonedCircle =(Circle) figureCircle.clone();
		figureCircle.getInfo();
		clonedCircle.getInfo();
		clonedCircle.setCentre(new Point(100, 100));
		figureCircle.setCentre(new Point(50, 50));
		figureCircle.getInfo();
		clonedCircle.getInfo();
	}
}
