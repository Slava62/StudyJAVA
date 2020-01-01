package ExamTask.CircleGameDesktop;

import java.awt.Color;
import java.lang.Math;

public class SimpleCircle {

  protected int x;
  protected int y;
  protected int radius;
  private Color color;
  public static final int AREA_MULTIPLEER=2;

  public SimpleCircle(int x, int y, int radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getRadius() {
    return radius;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }
  
  public SimpleCircle getCircleArea() {
	return new SimpleCircle(x, y, radius*AREA_MULTIPLEER);
}
  public boolean isIntersect(SimpleCircle circle) {
	return radius + circle.radius >= Math.sqrt(Math.pow(x-circle.x,2)+Math.pow(y-circle.y,2));

  }
}
