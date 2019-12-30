package ExamTask;;

import ExamTask.CircleGameDesktop.CanvasView;
import javax.swing.*;

public class Form extends JFrame {
    private String title;
    // setBounds(300, 300, 300, 300);
   private CanvasView canvasView;

    public Form() {
        initForm("CircleGameDesktop");
    }

    private void initForm(String title){
        this.title=title;
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        canvasView = new CanvasView(400,400);
        add(canvasView);
        pack();
        setVisible(true);
        canvasView.paint(canvasView.getGraphics());
    }

}

