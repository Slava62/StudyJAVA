package java_hometasks;

import java.util.Arrays;

public class TaskTwoHard {
private int index=0;
    /*Find equal sum of right
    *and left parts of array
  *return true if found
   */
  private boolean checkBalance(int [] ar) {
    int br=0,bl=0;
    for (int i=0;i<ar.length;i++){
    bl+=ar[i];
    br=0;
    for (int j=i+1;j<ar.length;j++){
      br+=ar[j];
    }
    if((bl-br)==0) { 
    index=i + 1;
    return true ;}
    }
    return false ;}
    
    //Print for checkBalance
    //return nothing
  private void printBalance(int [] b) {
  
    if(checkBalance(b))
    {
    System.out.println("\nArray:" +
    Arrays.toString(b) + "\nhas balance at index(start 1): " + index);
    }
  else
    {
    System.out.println("\nArray:" + 
    Arrays.toString(b) + "\nhas no balance.");
    }
    }
    
  //Execute task twohard
  //return nothing
  public static void Execute() 
  {
    TaskTwoHard TaskObject = new  TaskTwoHard();
   
    // subtask 6
    int [] a = {2, 2, 2, 1, 2, 2, 10, 1};
    TaskObject.printBalance(a);
    int [] b = {1, 1, 1, 2, 1};
    TaskObject.printBalance(b);
    int [] c={1,2,3,0,1,3,1,2};
    TaskObject.printBalance(c);
    

  }
  
}

