package ru.mirea.prac1;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.printf("%d-й элемент: %.2f\n", i, harmonic);
        }
    }
}