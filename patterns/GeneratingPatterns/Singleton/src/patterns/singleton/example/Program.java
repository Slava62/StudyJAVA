package patterns.singleton.example;

public class Program {

	public static void main(String[] args) {
		
		(new Thread() {
        	public void run() {
          /*  try {
				sleep(00l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
            Computer comp2 = new Computer(); 
            comp2.Launch("Windows 8.1");
            System.out.println(comp2.getOS().getName());
            
        }}).start();
		
		(new Thread() {
			public void run() {
		Computer comp = new Computer();
        comp.Launch("Windows 10");
        System.out.println(comp.getOS().getName());
         
        // we will not be able to change the OS, since the object has already been created   
        comp.Launch("Windows 8.1");
        System.out.println(comp.getOS().getName());
		}}).start();
		
       /* Runnable runnable =
                () -> { System.out.println("Lambda Runnable running"); };*/
	}

}
