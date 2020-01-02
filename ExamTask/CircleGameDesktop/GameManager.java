package ExamTask.CircleGameDesktop;

import java.util.ArrayList;
import ExamTask.CircleGameDesktop.EnemyCircle;
import ExamTask.CircleGameDesktop.MainCircle;
import ExamTask.CircleGameDesktop.SimpleCircle;

public class GameManager {
  public static final int MAX_CIRCLES = 10;
  private MainCircle mainCircle;
  private ArrayList<EnemyCircle> circles;
  private ICanvasView canvasView;
  private static int width;
  private static int height;

  public GameManager(ICanvasView canvasView, int w, int h) {
    this.canvasView = canvasView;
    width = w;
    height = h;
    initMainCircle();
    initEnemyCircles();
  }

  public static int getWidth() {
    return width;
  }

  public static int getHeight() {
    return height;
  }

  private void initMainCircle() {
    mainCircle = new MainCircle(width / 2, height / 2);
  }

  private void initEnemyCircles() {
    SimpleCircle mainCircleArea = mainCircle.getCircleArea();
    circles = new ArrayList<EnemyCircle>();
    for (int i = 0; i < MAX_CIRCLES; i++) {
      EnemyCircle circle;
      do {
        circle = EnemyCircle.getRandomCircle();
      } while (circle.isIntersect(mainCircleArea));
      circles.add(circle);
    }
    calculateAndSetCirclesColor();
  }

  private void calculateAndSetCirclesColor() {
    for (EnemyCircle circle : circles) {
      circle.setEnemyOrFood(mainCircle);
    }
  }

  public void onDraw() {
    canvasView.drawCircle(mainCircle);

    for (EnemyCircle circle : circles) {
      canvasView.drawCircle(circle);
    }

  }

  public void onTouchEvent(int x, int y) {
    mainCircle.moveMainCircleWhenTouchAt(x, y);
    checkCollision();
    moveCircles();
  }

  private void moveCircles() {
    for (EnemyCircle circle : circles) {
      circle.moveOneStep();
    }
  }

  private void checkCollision() {
    SimpleCircle circleForDel = null;
    for (EnemyCircle circle : circles) {
      if (mainCircle.isIntersect(circle)) {
        if (circle.isSmallerThen(mainCircle)) {
          mainCircle.growRadius(circle);
          circleForDel = circle;
          calculateAndSetCirclesColor();
          break;
        } else {
          gameEnd("You LOSE!!");
          return;
        }
      }
    }
    if (circleForDel != null) {
      circles.remove(circleForDel);
    }
    if (circles.isEmpty()) {
      gameEnd("You WIN!!");
    }
  }

  private void gameEnd(String message) {
    canvasView.showMessage(message);
    initMainCircle();
   // mainCircle.initRadius();
    initEnemyCircles();
    canvasView.redraw();
  }
}
