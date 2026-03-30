package ru.mirea.prac1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int sumWhile = 0;
        int i = 0;
        while (i < size) {
            sumWhile += array[i];
            i++;
        }
        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while (i < size);
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Sum (while): " + sumWhile);
        System.out.println("Sum (do-while): " + sumDoWhile);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}