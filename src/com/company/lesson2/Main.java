package com.company.lesson2;

public class Main {

    public static void main(String[] args) {

//        doChangeValueArray1to0and0to1();
//        doCreateArray_0_to_21_with_step_3();
//         doMultiply2();
//        fillDiagonal();
//        findInArrayMinMax();

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
        for (int i=0; i<array.length; i++){
             if (array[i]<6){
                System.out.println(array[i]*2);

            }else{
                System.out.println(" ");
            }

        }
        System.out.println(" \n \n ");
    }

    public static void fillDiagonal() {
            int[][] arr= new int[4][4];
            int n=2;
            for (int i = 0; i< arr.length; i++){
                for (int j = 0; j< arr.length; j++){
                    if ((i==j)||(j==n-i+1)){
                        System.out.println(" 11");
                    }else{
                        System.out.println(" "+i+j);
                    }
                }
                System.out.println();
            }
        }

    public static void findInArrayMinMax() {
        int[] array = new int[]{1, 2, 3, 750, 12, -4578, 15};
        int max,min;
        max=min=array[0];
        for (int i = 0; i < array.length; i++) {

            if(array[i]>max){
                max=array[i];
            }
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(" min = "+min+ "\n max = "+ max);
    }

}











