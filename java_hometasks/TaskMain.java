package java_hometasks;


import javax.swing.SwingUtilities;
import ExamTask.Form;

public class TaskMain {

  public static void main(String[] args) {

	  SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            createAndShowGui();
	         }
	      });
  }
  private static void createAndShowGui() {
	  Form myForm = new Form();
  }
}
