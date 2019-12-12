package java_hometasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
  // Get random word from arrya
  // return char array of that word
  private char[] randomWord(String[] words) {
    return (words[(new Random().nextInt(words.length))]).toCharArray();
  }
  // Get word from console
  // return char array of that word
  private String consoleWord() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Input your variant:");
    String s = (sc.nextLine());
    sc.close();
    return s;
  }
  // start game
  // return
  public void startGame(String[] words) {
    char[] mask = new char[15];
    createMask(mask, '*');
    char[] var;
    int N = 0;
    // Get random word from array
    char[] word = randomWord(words);
    N = mask.length;
    if (N > word.length) N = word.length;
    boolean result = true;
    while (result) {
      // Get variant
      var = (consoleWord()).toCharArray();
      // System.out.println(var);
      // System.out.println(word);
      result = false;

      for (int i = 0; i < N; i++) {
        if (i >= var.length) {
          result = true;
          continue;
        }
        if (word[i] != var[i]) {
          result = true;
        } else {

          mask[i] = word[i];
        }
      }
      if (var.length > N) result = true;
      // Show result

      System.out.println((mask));
      if (!result) {
        System.out.println("You're win!!");
      } else {
        System.out.println("Try again");
        createMask(mask, '#');
      }
    } // while
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
