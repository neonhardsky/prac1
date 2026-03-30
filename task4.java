package ru.mirea.prac1;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Ввод элементов массива
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // 1) Вычисление суммы через цикл while
        int sumWhile = 0;
        int index = 0;
        while (index < array.length) {
            sumWhile += array[index];
            index++;
        }

        // 2) Вычисление суммы через цикл do while
        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while (i < array.length);

        // Поиск min и max (можно сделать в одном цикле)
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Вывод результатов
        System.out.println("Сумма (while): " + sumWhile);
        System.out.println("Сумма (do while): " + sumDoWhile);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}