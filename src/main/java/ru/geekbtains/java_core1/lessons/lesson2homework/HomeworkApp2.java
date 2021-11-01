package ru.geekbtains.java_core1.lessons.lesson2homework;

public class HomeworkApp2 {
    public static void main(String[] args) {
        checkTwoIntSum(20, 5);
        varIsPositive(78);
        intNegativeIsTrue(70);
        String s = "Hello there!";
        int n = 4;
        printString(s, n);
        // checkLeapYear(int y = 100);

    }

    public static boolean checkTwoIntSum(int a, int b) {
        int sum = a + b;
        if (sum <= 10 && sum >= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void varIsPositive(int c) {
        if (c >= 0) {
            System.out.println("Positive"); }
            else System.out.println("Negative");
    }

    public static boolean intNegativeIsTrue(int d) {
        return d < 0;
    }

    public static void printString(String s, int n) {
        for (int i = 0; i < n; i++ ) {
            System.out.println(s);
        }
    }
}