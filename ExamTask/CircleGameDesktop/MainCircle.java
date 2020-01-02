package ExamTask.CircleGameDesktop;
//import android.graphics.Color;
import java.awt.Color;
public class MainCircle extends SimpleCircle {

  public static final int INIT_RADIUS = 30;
  public static final int MAIN_SPEED = 100;
  public static final Color OUR_COLOR=Color.BLUE;

  public MainCircle(int x, int y) {
    super(x, y, INIT_RADIUS);
   // System.out.println("X: "+x*2 + "Y :"+y*2);
    setColor(OUR_COLOR);
  }

  public void moveMainCircleWhenTouchAt(int x1, int y1) {
    int dx = (x1 - x) * MAIN_SPEED / GameManager.getWidth();
    int dy = (y1 - y) * MAIN_SPEED / GameManager.getHeight();
    x = x + dx;
    y = y + dy;
  }
  public void initRadius() {
	radius = INIT_RADIUS;
}
  public void growRadius(SimpleCircle circle){
  radius =(int) Math.sqrt(Math.pow(radius,2)+Math.pow(circle.radius,2));
}
}
