package java_hometasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java_hometasks.TaskThree;

public class TaskThree {
  // Print words array in columns
  // return nothing
  public void printWords(String[] words, int n) {
    String[] tmp = words.clone();
    if (n <= 0) n = 1;
    for (int i = 0; i < tmp.length; i++) {
      // tmp[i]  = tmp[i] + '\t';
      if ((i + 1) % n == 0) {
        tmp[i] = tmp[i] + '\n';
      }
    }
    System.out.println(Arrays.toString(tmp));
  }
  // Create mask of output
  // return nothing
  private void createMask(char[] field, char type) {
    for (int i = 0; i < field.length; i++) {
      field[i] = type;
    }
  }
  // start game
  // return
  public void startGame(String[] words) {
    char[] mask = new char[15];
    char[] word = {'l', 'e', 'm', 'o', 'n'};
    char[] var = {'l', 'e', 'a', 'k'};
    int N = mask.length;
   
    createMask(mask, '*');
    boolean result = true;
    if (N>word.length) N=word.length;
    if (N>var.length) N=var.length;
    for (int i = 0; i < N; i++) {
      if (word[i] != var[i]) {
        result = false;
      } else {
        mask[i] = word[i];
      }
    }
    
    System.out.println((mask));
  }
  // Execute task three
  // return nothing
  public static void Execute() {
    TaskThree TaskObject = new TaskThree();
    // Game Words

    String[] words = {
      "apple",
      "orange",
      "lemon",
      "banana",
      "apricot",
      "avocado",
      "broccoli",
      "carrot",
      "cherry",
      "garlic",
      "grape",
      "melon",
      "leak",
      "kiwi",
      "mango",
      "mushroom",
      "nut",
      "olive",
      "pea",
      "peanut",
      "pear",
      "pepper",
      "pineapple",
      "pumpkin",
      "potato"
    };
    System.out.println("Words for game:");
    TaskObject.printWords(words, 4);
    TaskObject.startGame(words);
  }
}
