package com.company.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static final int SIZE=3;

    public static final int DOTS_TO_WIN =3;

    public static final char DOT_EMPTY='*';
    public static final char DOT_X='X';
    public static final char DOT_O='O';

    public static Scanner scanner=new Scanner(System.in);
    public static Random    rand = new Random();

    public static void main(String[] args) {
    initMap();
    printMap();
    while (true){
        humanTurn();
        printMap();
        if (checkWin0(DOT_X)){
            System.out.println("Победил человек");
            break;
        }
        if (isMapFull()){
            System.out.println("Ничья");
            break;
        }
        aiTurn();
        printMap();
        if (checkWin0(DOT_O)){
            System.out.println("Выиграл компьютер");
            break;
        }
        if (isMapFull()){
            System.out.println("Ничья");
            break;
        }
    }
        System.out.println("GAME OVER");
    scanner.close();
    }

    public static void initMap() {
      map=new char[SIZE][SIZE];
      for (int i=0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                map[i][j]=DOT_EMPTY;
            }
        }
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        } return true;
    }
    public static void printMap() {
        for (int i=0;i<=SIZE;i++){
            System.out.print(i+" ");
        }
            System.out.println();
        for (int i=0;i<SIZE;i++){
            System.out.print((i+1)+" ");
            for(int j=0;j<SIZE;j++){
                System.out.print(map[i][j] + " ");
            }
                System.out.println();
        }
                System.out.println();
    }

    public static void humanTurn() {
    int x,y;
        do {
        System.out.println("Введите координате в формате X Y");
        x=scanner.nextInt()-1;
        y=scanner.nextInt()-1;
        }while(isNotCellValid(x, y));
        map[y][x]=DOT_X;
    }

    public static boolean isNotCellValid(int x, int y) {
    if (x<0||x>=SIZE||y<0||y>=SIZE) return true;
        return map[y][x] != DOT_EMPTY;
    }
    public static void aiTurn(){
    int x, y;
    do{
        x= rand.nextInt(SIZE);
        y= rand.nextInt(SIZE);
    }while (isNotCellValid(x, y));
        System.out.println("Компьютер походил в точку "+(x+1)+" "+(y+1));
        map[y][x]=DOT_O;
    }

    public static boolean checkWin0(char symbol) {
        int mainDiagonalDot,sideDiagonalDot,horizontalDot, verticalDot;
        for (int i = 0; i < SIZE; i++) {
            horizontalDot=0;
            verticalDot=0;
            for (int j = 0; j < SIZE; j++) {
              if(map[i][j]==symbol){
                  horizontalDot++;
              }
              if (map[j][i]==symbol){
                      verticalDot++;
              }
            }
            if (horizontalDot==DOTS_TO_WIN||verticalDot==DOTS_TO_WIN) return true;
        }
            mainDiagonalDot=0;
            sideDiagonalDot=0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i]==symbol){
             mainDiagonalDot++;
            }
            if (map[i][SIZE-i-1]==symbol){
             sideDiagonalDot++;
            }
        }
        return mainDiagonalDot == DOTS_TO_WIN || sideDiagonalDot == DOTS_TO_WIN;
    }
}
