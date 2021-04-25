package com.company.lesson11;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BoxArr<T> {
private  T[] array;

    public BoxArr(T... array) {
        this.array = array;
    }

    public void changingElemArray(int a, int b) {
        T c = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = c;
    }

    public T[] getArray() {
        System.out.println(Arrays.deepToString(array));
        return array;
    }

    public ArrayList<T> arrToArrList(){
        ArrayList<T> arrayList=new ArrayList<T>(Arrays.asList(this.array));
return arrayList;
    }

}
