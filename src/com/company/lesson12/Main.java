package com.company.lesson12;

public class Main {
    static final int size = 10_000_000;
    static final int half = size / 2;
    static int count=0;
   private static float[] arr = new float[size];

    public static void main(String[] args) {
        for (int i = 0; i < size; i++) {
            arr[i]=1;
            count++;
            System.out.println(arr[i]+ " "+count);
        }
        calcSingleThread(arr);
        calcSecondThread(arr);

    }
    private static void calcSingleThread(float[] arr){

    long a=System.currentTimeMillis();
        getCalcArrSize(arr);
        System.out.println("Расчёт в потоке "+Thread.currentThread().getName()+". "+"Прошло времени,мс: "+(System.currentTimeMillis() - a));
        System.currentTimeMillis();
    }

    private static void calcSecondThread(float[] arr){

        float[] halfArrPartOne=new float[half];
        float[] halfArrPartTwo=new float[half];

        long aTwo=System.currentTimeMillis();


        Thread t1 = new Thread(()->{
            long aa=System.currentTimeMillis();
            System.arraycopy(arr, 0, halfArrPartOne, 0, half);
            Thread.currentThread().setName("secondThreadPartOne");
            getCalcArrHalfSize(halfArrPartOne);
            System.arraycopy(halfArrPartOne, 0, arr, 0, half);
            System.out.println("Расчёт первой части массива. Поток: "+Thread.currentThread().getName()+"Время расчёта,мс: "+ (System.currentTimeMillis() - aa));
        });
        Thread t2=new Thread(()->{
            long aaa=System.currentTimeMillis();
            System.arraycopy(arr, half, halfArrPartTwo, 0, half);
            Thread.currentThread().setName("secondThreadPartTwo");
            getCalcArrHalfSize(halfArrPartTwo);

            System.arraycopy(halfArrPartTwo, 0, arr, half, half);
            System.out.println("Расчёт второй части массива. Поток: "+Thread.currentThread().getName()+"Время расчёта,мс: "+ (System.currentTimeMillis() - aaa));
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Расчёт с делением массива на две части.Прошло времени,мс: "+(System.currentTimeMillis() - aTwo));
        System.currentTimeMillis();
    }

    private static void getCalcArrSize(float[] arr) {
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }

    private static void getCalcArrHalfSize(float[] arr) {
        for (int i = 0; i < half; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
                    Math.cos(0.4f + i / 2));
        }
    }
}

