package java_hometasks;

import java_hometasks.TaskTwo;

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
  /*
   */
  private void InvertArrayElements() {}

  // Execute task two
  // return nothing
  public static void Execute() {
    TaskTwo TaskObject = new TaskTwo();
    // subtask 1
    byte[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    // print base array
    System.out.println("Base array:");
    for (byte b : a) {
      System.out.print(b + "");
    }
    System.out.println("\nInverted array: ");
    // print inverted array
    for (byte b : TaskObject.InvertArrayElements(a)) {
      System.out.print(b + "");
    }
  }
}
