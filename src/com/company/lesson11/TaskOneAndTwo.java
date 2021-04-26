package com.company.lesson11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskOneAndTwo<T> {
private final T[] array;

    @SafeVarargs
    protected TaskOneAndTwo(T... array) {
        this.array = array;
    }

    public void changingElemArray(int a, int b) {
        T c = this.array[a];
        this.array[a] = this.array[b];
        this.array[b] = c;
    }

    public void getArray() {
        System.out.println(Arrays.deepToString(array));
    }

   public void arrToArrList(List<T> listArr){
        //ArrayList<T> arrayList=new ArrayList<T>(Arrays.asList(arrays));
       Collections.addAll(listArr,this.array);

   }

}
