package ExamTask.CircleGameDesktop;

//import android.graphics.Color;
import java.awt.Color;
import java.util.Random;

public class EnemyCircle extends SimpleCircle {

  public static final int FROM_RADIUS = 10;
  public static final int TO_RADIUS = 60;
  public static final Color ENEMY_COLOR = Color.RED;
  public static final Color FOOD = Color.GREEN;
  public static final int RANDOM_SPEED=1;
  
  private int dx;
  private int dy;

  public EnemyCircle(int x, int y, int radius, int dx, int dy) {
    super(x, y, radius);
    this.dx=dx;
    this.dy=dy;
  }

  public static EnemyCircle getRandomCircle() {
    Random random = new Random();
    int x = random.nextInt(GameManager.getWidth());
    int y = random.nextInt(GameManager.getHeight());
    int dx = 1 + random.nextInt(RANDOM_SPEED);
    int dy = 1 + random.nextInt(RANDOM_SPEED);
    int radius = FROM_RADIUS + random.nextInt(TO_RADIUS - FROM_RADIUS);
    EnemyCircle enemyCircle = new EnemyCircle(x, y, radius,dx,dy);
    enemyCircle.setColor(ENEMY_COLOR);
    return enemyCircle;
  }

  public void setEnemyOrFood(MainCircle mainCircle) {
    if (isSmallerThen(mainCircle)) {
      setColor(FOOD);
    } else {
      setColor(ENEMY_COLOR);
    }
  }

  public boolean isSmallerThen(SimpleCircle circle) {
    return radius < circle.radius;
  }
  public void moveOneStep() {
	x += dx;
	y += dy;
	checkBounds();
}
  public void checkBounds() {
	if (x>GameManager.getWidth() || x<0) {
		dx = -dx;
	}
	if (y>GameManager.getHeight() || y<0) {
		dy = -dy;
	}
}
}
