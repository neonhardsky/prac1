package ru.mirea.prac1;

import java.util.Scanner;

public class task7 {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определён");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое неотрицательное число: ");
        int number = scanner.nextInt();

        long fact = factorial(number);
        System.out.println(number + "! = " + fact);

        System.out.println("\nПроверка для чисел от 0 до 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}