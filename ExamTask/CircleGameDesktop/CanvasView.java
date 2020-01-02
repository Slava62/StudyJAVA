package ExamTask.CircleGameDesktop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CanvasView extends Canvas implements ICanvasView, MouseMotionListener {

   private Graphics graphics;
   private GameManager gameManager;
   private ToastMessage toastMessage;


    public CanvasView(int width, int height) {
    this.setSize(width, height);
    addMouseMotionListener(this);
    gameManager = new GameManager(this, width, height);
    }

    @Override
    public void paint(Graphics g) {
       graphics = g;
       graphics.setPaintMode();
       gameManager.onDraw();
    }

    @Override
   public void drawCircle(SimpleCircle circle){
          graphics.setColor(circle.getColor());
          graphics.fillOval(circle.getX()-circle.getRadius(),
                  circle.getY()-circle.getRadius(),
                  circle.getRadius()*2, circle.getRadius()*2);
   }

    @Override
    public void showMessage(String message) {
    toastMessage=new ToastMessage(message);
    toastMessage.display();
    }

    @Override
    public void redraw() {
        this.paint(graphics);
        //invalidate();
    }


    @Override
    public void mouseDragged(MouseEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        gameManager.onTouchEvent(x, y);
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent event) {

    }



}
