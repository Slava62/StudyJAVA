package java_hometasks;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static final int SIZE=3;

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
        }else{
        field[y][x] = EMPTY_DOT;
        return true;}
    }
    //Read x and y from console
    static void playerStep() {
        int x=-1;
        int y=-1;
        do {
            System.out.println("Введите координаты X и Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!valid(y, x));
        setSymbol(y, x, PLAYER_DOT);
    }
    //Create AI step
    static void aiStep() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!valid(y, x));
        setSymbol(y, x, AI_DOT);
    }
    //Save step in array field
    private static void setSymbol(int y, int x, char symbol) {
        field[y][x] = symbol;
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
