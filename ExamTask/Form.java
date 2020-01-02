package ExamTask;

import ExamTask.CircleGameDesktop.CanvasView;
import javafx.scene.layout.Pane;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class Form extends JFrame {
  //  private String title;JFrame
    // setBounds(300, 300, 300, 300);
   private CanvasView canvasView;

    public Form() {
        initForm("CircleGameDesktop");
    }

    private void initForm(String title){
       // this.title=title;
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        canvasView = new CanvasView(400,400);
       // JRootPane j= getRootPane();
     getContentPane().add(canvasView);
      //  setSize(canvasView.getPreferredSize());
        
       pack();
       
        setLocationByPlatform(true);
       
        setVisible(true);
       
        //canvasView.paint(canvasView.getGraphics());
    }

}

