package java_hometasks;

import java.util.Arrays;

public class TaskTwoHard 
{
private int index=0;
    /*Find equal sum of right
    *and left parts of array
  *return true if found
   */
  private boolean checkBalance(int [] ar) {
    int br=0,bl=0;
    for (int i=0;i<ar.length;i++)
    {
    bl+=ar[i];
    br=0;
    for (int j=i+1;j<ar.length;j++)
    {
      br+=ar[j];
    }
    if((bl-br)==0) { 
    index=i + 1;
    return true ;}
    }
    return false ;
 }
    
    //Print for checkBalance
    //return nothing
  private void printBalance(int [] b)
 {
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
    //Roll array n times
    //return array as String
    private String rollArray(int [] arr, int offset ) 
 {
    int tmp, n = arr.length;
    boolean sign=true ;
    if(offset<0){ sign=false ; offset=-offset;}
    
   while (offset>=n) offset=offset-n;
   while (offset!=0){
    if(sign){
     tmp = arr[n-1];
    for (int i = (n - 1); i > 0; i--)
    {
        arr[i] = arr[i-1];
    }
    arr[0] = tmp; }
    else{
      tmp=arr[0];
      for(int i =0;i<(n-1);i++){
        arr[i]=arr[i+1];
      }
      arr[n-1]=tmp;
    }
    offset--;
    }
    
    return (Arrays.toString(arr));
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
    //subtask 7
    int N=3;
    System.out.println("\nBase array:\n" +
    Arrays.toString(c));
    System.out.println("Rolled array:"+ N + "\n" +
    TaskObject.rollArray(c,N));
    N=-11;
System.out.println("Rolled array:"+ N + "\n" +
    TaskObject.rollArray(c,N));

  }
  
}

