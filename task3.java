package ru.mirea.prac1;

public class task3 {
    public static void main(String[] args) {
        // Инициализация массива (как в Си)
        int[] numbers = {5, 10, 15, 20, 25, 30};

        int sum = 0;
        // Цикл for для вычисления суммы
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Массив чисел:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}