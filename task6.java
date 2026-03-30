package ru.mirea.prac1;

public class task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            double harmonic = 1.0 / n;
            // Форматирование до 5 знаков после запятой
            System.out.printf("H(%d) = %.5f%n", n, harmonic);
        }
    }
}