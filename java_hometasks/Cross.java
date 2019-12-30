package java_hometasks;

import java.util.Random;
import java.util.Scanner;


public class Cross {

    static final int SIZE=3;
    static boolean IS_FIRST=true;

    static char[][] field = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    //Symbol player
    static final char PLAYER_DOT = 'X';
    //Symbol AI
    static final char AI_DOT = 'O';
    //Symbol default
    static final char EMPTY_DOT = '.';
    //Fill array with default symbols
    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }
    //Just print array field
    static void printField() {
        //Print header columns` numbers
        for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        //print array
        for (int i = 0; i < SIZE; i++) {
            //print row number
            System.out.print((i + 1) + " |");
            //print row from array
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }

    //Check if position is out of array
    private static boolean valid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }else
        {
            return field[x][y] == EMPTY_DOT;
        //field[y][x] = EMPTY_DOT;
        }
    }

    //Read x and y from console
    static void playerStep() {
        int x=0;
        int y=0;
        do {
            System.out.println("Введите координаты X(строка) и Y(столбец");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!valid(y, x));

        setSymbol(y, x, PLAYER_DOT);
    }
    //Create AI step
    static void aiStep() {
        int x=0;
        int y=0;
        //first step
        if (IS_FIRST) {
            do {
                x = random.nextInt(SIZE);
                y = random.nextInt(SIZE);
            }
            while (!valid(y, x));
            IS_FIRST=false;
        }
        else{
        //other steps
          String  s="XX";
          StringBuilder tmp;

          //row
            for (int i = 0; i < SIZE; i++) {
                tmp = new StringBuilder();
                for (int j = 0; j < SIZE; j++) {
                    if (field[i][j] == PLAYER_DOT) tmp.append(PLAYER_DOT);
                }
                if(tmp.toString().equals(s)){
                    for (int j = 0; j < SIZE; j++) {
                        if(field[i][j]==EMPTY_DOT) {x=i;y=j;  break;}
                    }
                }
            }
            //col
            for (int i = 0; i < SIZE; i++) {
                tmp = new StringBuilder();
                for (int j = 0; j < SIZE; j++) {
                    if (field[j][i] == PLAYER_DOT) tmp.append(PLAYER_DOT);
                }
                    if(tmp.toString().equals(s)){
                    for (int j = 0; j < SIZE; j++) {
                        if(field[j][i]==EMPTY_DOT) {x=j;y=i;break;}
                    }
                }
            }
            //diag 1
            tmp = new StringBuilder();
            for (int i = 0; i < SIZE; i++) {
                    if (field[i][i]==PLAYER_DOT) tmp.append(PLAYER_DOT);
        }
                if(tmp.toString().equals(s)) {
                    for (int i = 0; i < SIZE; i++) {
                        if (field[i][i] == EMPTY_DOT) {
                            x = i;
                            y = i;
                            break;
                        }
                    }
                }
            //diag 2
            tmp = new StringBuilder();
            for (int i = 0; i <SIZE; i++) {
                if (field[SIZE-i-1][i]==PLAYER_DOT) tmp.append(PLAYER_DOT);
            }
            if(tmp.toString().equals(s)) {
                for (int i = 0; i <SIZE; i++) {
                    if (field[SIZE-i-1][i] == EMPTY_DOT) {
                        x = SIZE-i-1;
                        y = i;
                        break;
                    }
                }
            }
        }

        setSymbol(y, x, AI_DOT);
    }



    //Save step in array field
    private static void setSymbol(int y, int x, char symbol) {
        field[x][y] = symbol;
    }
    //Check end of the game
    static boolean isFieldsFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }
    //Check winner
    static boolean checkWin(char symbol) {
        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol)
            return true;
        if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol)
            return true;
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol)
            return true;
        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol)
            return true;
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol)
            return true;
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol)
            return true;
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol)
            return true;
        if (field[2][0] == symbol && field[1][1] == symbol && field[0][2] == symbol)
            return true;
        return false;
    }
    // Game process
    public static void Execute() {
        initField();
        printField();
        IS_FIRST=true;

        while (true) {
            //player
            playerStep();
            printField();
            //Check win
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN");
                break;
            }
            //Check full
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
            //AI
            aiStep();
            printField();
            //Check win
            if (checkWin(AI_DOT)) {
                System.out.println("SkyNet WIN");
                break;
            }
            //Check full
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
