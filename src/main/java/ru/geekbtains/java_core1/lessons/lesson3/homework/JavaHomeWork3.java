package ru.geekbtains.java_core1.lessons.lesson3.homework;

import java.util.Arrays;

public class JavaHomeWork3 {
    public static void main(String[] args) {
        int[] invertedArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(invertedArr);
        System.out.println(Arrays.toString(invertedArr));
        int[] eightArr = fillArrayWithStep(100, 1);
        System.out.println(Arrays.toString(eightArr));
        System.out.println(Arrays.toString(changeArray(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
        int[] changeArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(changeArray));
        fillDiagonal(5);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - 1) * -1;
        }
    }

    public static int[] fillArrayWithStep(int size, int step) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    static int[] changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 6)
                arr[i] *= 2;
        return arr;
    }

    public static void fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}