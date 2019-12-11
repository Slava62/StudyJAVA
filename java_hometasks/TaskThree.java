package java_hometasks;

import java.util.Arrays;
import java.util.Random;


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
  //Get random word from arrya
  //return char array of that word
  private char[] randomWord(String [] words) {
    return (words[(new Random().nextInt(words.length))]).toCharArray();
  }
  // start game
  // return
  public void startGame(String[] words) {
    char[] mask = new char[15];
    createMask(mask, '*');
    int N = mask.length;
    //Get random word from array
    char[] word = randomWord(words);
    if (N>word.length) N=word.length;
    boolean result = false;
  // while(result){
     //Get variant
    char[] var = {'l', 'e', 'a', 'k'};

    result = true;
    //
    if (N>var.length) N=var.length;
    for (int i = 0; i < N; i++) {
      if (word[i] != var[i]) {
        result = false;
      } else {
        mask[i] = word[i];
      }
    }
    //Show result
    System.out.println((mask));
 // }
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
