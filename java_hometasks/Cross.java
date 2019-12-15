package com.geekbrains.lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static final int SIZE_X = 3;
    static final int SIZE_Y = 3;

    static char[][] field = new char[SIZE_X][SIZE_X];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';

    static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE_Y; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
    }


    private static boolean valid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X и Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }
        while (!valid(y, x));
        setSymbol(y, x, PLAYER_DOT);
    }

    static void aiStep() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        }
        while (!valid(y, x));
        setSymbol(y, x, AI_DOT);
    }

    private static void setSymbol(int y, int x, char symbol) {
        field[y][x] = symbol;
    }

    static boolean isFieldsFull() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

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

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Player WIN");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("SkyNet WIN");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
