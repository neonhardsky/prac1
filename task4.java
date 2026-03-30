package ru.mirea.prac1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sumWhile = 0;
        int i = 0;
        while (i < array.length) {
            sumWhile += array[i];
            i++;
        }
        System.out.println("Сумма (через while): " + sumWhile);

        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += array[j];
            j++;
        } while (j < array.length);
        System.out.println("Сумма (через do-while): " + sumDoWhile);

        int min = array[0];
        int max = array[0];

        for (int k = 1; k < array.length; k++) {
            if (array[k] < min) min = array[k];
            if (array[k] > max) max = array[k];
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}