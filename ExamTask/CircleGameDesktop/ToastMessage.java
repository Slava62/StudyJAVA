package ExamTask.CircleGameDesktop;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import java.awt.GridBagLayout;

import java.awt.Font;

import javax.swing.JFrame;




class ToastMessage extends JFrame {
	

	private String message;	

    public ToastMessage(final String message,Container container) {
    
    	this.message=message;
        setUndecorated(true);
        setLayout(new GridBagLayout());
        setBackground(new Color(0,0,0,0));
        setLocationRelativeTo(container);;
        setSize(120, 30);
              
     }  
    @Override
    public void paint(Graphics g) {
    	g.setColor(Color.black);
    	g.setFont(new Font("Arial", Font.PLAIN, 20));
    	g.drawRoundRect(
    			0,
        	    0,
        		getWidth()-5,
                getHeight()-5, getHeight()/2, getHeight()/2);
    	g.drawString(message, 10, 20); 
        }
   
    

    public void display() {
        try {
            setOpacity(1);
            setVisible(true);
            Thread.sleep(2000);

            //hide the toast message in slow motion
            for (double d = 1.0; d > 0.2; d -= 0.1) {
                Thread.sleep(100);
                setOpacity((float)d);
            }

            // set the visibility to false
            setVisible(false);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}