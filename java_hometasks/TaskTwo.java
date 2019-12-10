package java_hometasks;

import java.util.Arrays;
import java_hometasks.TaskTwoHard;

public class TaskTwo {

  /*Change 0 to 1 and 0 to 1
   * in array like [1,0,..,1,1,0]
   * return changed array
   */
  private byte[] InvertArrayElements(byte[] ar) {
    byte[] arr = ar.clone(); // just to save base array
    for (int i = 0; i < arr.length; i++) {
      switch (arr[i]) {
        case 1:
          arr[i] = 0;
          break;
        case 0:
          arr[i] = 1;
          break;
      }
    }
    return arr;
  }
  /*Find min element of array
  *return min
   */
  private byte Min(byte [] ar) {
    byte min=ar[0];
    for (byte b : ar){if(b<min) min=b;}
    return min;
  }
/*Find max element of array
  *return min
   */
  private byte Max(byte [] ar) {
    byte max=ar[0];
    for (byte b : ar){if(b>max) max=b;}
    return max;
    }
  //Execute task two
  //return nothing
  public static void Execute()  {
    TaskTwo TaskObject = new TaskTwo();
   
    // subtask 1
    byte [] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
    
    // print base array
    System.out.println("Base array:");
    for (byte b : a) {
      System.out.print(b + " ");
    }
    System.out.println("\nInverted array: ");
    // print inverted array
    for (byte b : TaskObject.InvertArrayElements(a)) {
      System.out.print(b + " ");
    }
    // subtask 2
    int[] arr = new int[8];
    int i = 0;
    while (i < arr.length) {
      arr[i] = i * 3;
      i++;
    }
    System.out.println("\n\nArray of 8 elements n*3");
    for (int b : arr) { System.out.print(b + " ");
    }
    // subtask 3
    byte[] c = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8,9,1};
    System.out.println("\n\nBase array:");
   System.out.println(Arrays.toString(c));
    for (int j=0;j<c.length;j++){if (c[j]<6) c[j]*=2;}
    System.out.println("Array n*2 where n<6\n" + Arrays.toString(c));
    //subtask 4
    int n=7;
    byte [][] d =new byte[n][n];
    System.out.println("\nSquare array 10x10");
    for (int j = 0; j < n; j++) {
      for (int k = 0; k < n; k++) {
        if (j==k || k==(n-j-1)) d[k][j]=1;
      }
    }
    for (byte [] b : d){System.out.println(Arrays.toString(b));}
    //subtask 5
    System.out.println("\nMin of array: \n" +
    (Arrays.toString(c)) + "\nequals: " +  TaskObject.Min(c));
    System.out.println("Max of array equals: " +  TaskObject.Max(c));
    //subtasks 6-7
    TaskTwoHard.Execute();
  }
}
