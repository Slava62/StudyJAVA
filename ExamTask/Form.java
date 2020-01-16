package ExamTask;

import ExamTask.CircleGameDesktop.CanvasView;
import javax.swing.*;
import java.awt.*;

public class Form extends JFrame {
   
    private CanvasView canvasView;

    public Form() {
        initForm("CircleGameDesktop");
    }

    private void initForm(String title){
       
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(new Dimension(400,600));
        setVisible(true);
        canvasView = new CanvasView(getContentPane().getWidth(),getContentPane().getHeight());
        add(canvasView);
       
    }

}


