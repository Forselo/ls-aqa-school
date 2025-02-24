package ru.ls.qa.school.core;

public class OddTask {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {

        int[] testNumbers = { 1, 2, 3, 4, 5, 10, 15, 20, 25 };

        for (int number : testNumbers) {
            System.out.println("Число " + number + " нечетное? " + isOdd(number));
        }
    }
}
