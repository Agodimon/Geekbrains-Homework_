package com.company.lesson9;

public class Main {
    public static void main(String args[]) {

        String[][] array={{" 2"," 4"," 9","10"},{"44","89","77","87"},{"33","12","11","7"},{"10","88","55","33"}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                int s = Integer.parseInt(array[i][j].trim());
                System.out.print(" "+s+" ");
            }
            System.out.println();
        }

        //convertIndexArrayStringToInt(table);
    }

    private static void convertIndexArrayStringToInt(String[][] table) {
        for (int i = 0; i< table.length; i++){
            for (int j = 0; j< table.length; j++){
                int s = Integer.parseInt(table[i][j].trim());
                System.out.println(s);
            }
        }
    }
}
