package ExamTask.CircleGameDesktop;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class CanvasView extends Canvas implements ICanvasView, MouseMotionListener {

   private Graphics graphics;
   private GameManager gameManager;
   private ToastMessage toastMessage;

    @SuppressWarnings("unused")
	private CanvasView() {}
   
    public CanvasView(int width, int height) {
    this.setSize(width, height);
    addMouseMotionListener(this);
    gameManager = new GameManager(this, width, height);
    }

    @Override
    public void paint(Graphics g) {
       graphics =  g;
       graphics.setPaintMode();
       gameManager.onDraw();
    }

    @Override
   public void drawCircle(SimpleCircle circle){
    	  //Graphics2D g2 =(Graphics2D) graphics;
          graphics.setColor(circle.getColor());
         // g2.fillOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
          graphics.fillOval(circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius());
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
    	Point mousePoint = event.getPoint();
        int x = mousePoint.x;
        int y = mousePoint.y;
        gameManager.onTouchEvent(x, y);
        this.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent event) {

    }

    @Override
    public Dimension getPreferredSize() {
       return new Dimension(this.getWidth(), this.getHeight());
    }

}
