package com.company.lesson2;
public class Main {
    public static void main(String[] args) {
      doChangeValueArray1to0and0to1();
      doCreateArray_0_to_21_with_step_3();
      doMultiply2();
      fillDiagonal();
      findInArrayMinMax();
      int[] arr=new int[]{2,14,16,0,17,15};
      System.out.println(checkBalance(arr));
    }
    public static boolean checkBalance(int[] arrays ) {
        int sumDoNull = 0;
        int sumAfterNull = 0;
        int counter=0;
        for (int array : arrays) {
            if (array != 0) {
                sumDoNull = sumDoNull + array;
                counter++;
            } else {
                break;
            }
        }
        for (int i=counter+1;i<arrays.length;i++){
          if(arrays[i]!=0){
           sumAfterNull=sumAfterNull+arrays[i];
          } else {
              break;
          }
        }
        System.out.println(sumDoNull + " = " + sumAfterNull);
        return sumDoNull == sumAfterNull;
    }
    public static void doChangeValueArray1to0and0to1() {
        int[] doChangeArray = {1, 0, 1, 1, 0, 1, 1, 0};
        for (int i = 0; i < doChangeArray.length; i++) {
            if (doChangeArray[i] == 0) {
                doChangeArray[i] = 1;
            } else {
                doChangeArray[i] = 0;
            }
            System.out.println(doChangeArray[i]);
        }
            System.out.println("\n \n");
    }
    public static void doCreateArray_0_to_21_with_step_3() {
        int[] array_= new int[8];
        array_[0]=0;
        System.out.println(array_[0]);
            for (int i = 1; i < array_.length; i = i + 1){
                array_[i]=array_[i-1]+3;
                System.out.println(array_[i]);
            }
                System.out.println("\n \n");
    }
    public static void doMultiply2() {
        int[] array={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j : array) {
            if (j < 6) {
                System.out.println(j * 2);
            } else {
                System.out.println(" ");
            }
        }
        System.out.println(" \n \n ");
    }
    public static void fillDiagonal() {
            int[][] arr= new int[11][11];
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j< arr.length; j++){
                     if (i==j||j==arr[i].length-i-1){
                       arr[i][j]=1;
                     }
                    System.out.print(" "+arr[i][j]);
                }
                System.out.println();
            }
    }
    public static void findInArrayMinMax() {
        int[] array = new int[]{1, 2, 3, 750, 12, -4578, 15};
        int max,min;
        max=min=array[0];
        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }
        System.out.println(" min = "+min+ "\n max = "+ max);
    }
}











