package ru.novikov.array.task1;

import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        int arraySize = 5;
        SimpleRandom simpleRandom = new SimpleRandom(100);

        int [][] array = new int[arraySize]
                [arraySize];

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++)
                array[i][j] = simpleRandom.nextInt();

        int max = array[0][0],
                min = array[0][0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j])
                    max = array[i][j];

                else if (min > array[i][j])
                    min = array[i][j];

                sum += array[i][j];
            }
        }

        double avg = sum / (array[0].length * array.length);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }
}

class SimpleRandom {
    private int max;
    private int last;

    public SimpleRandom(int max){
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    public int nextInt(){
        last = (last * last + Byte.MAX_VALUE) % Short.MAX_VALUE;
        return last % max;
    }
}
