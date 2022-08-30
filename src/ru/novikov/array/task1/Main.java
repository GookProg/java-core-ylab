package ru.novikov.array.task1;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{7, 1, 2, 4, 9},
                {3, 0, 4, 5, 2}};

        int max = array[0][0],
                min = array[0][0];
        double avg = 0.0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (max < array[i][j])
                    max = array[i][j];

                else if (min > array[i][j])
                    min = array[i][j];

                avg += array[i][j];
            }
        }

        avg /= (array[0].length * array.length);

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Avg: " + avg);
    }
}
