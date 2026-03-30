package ru.mirea.prac1;

public class task3 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;
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