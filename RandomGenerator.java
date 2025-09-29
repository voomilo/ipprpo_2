import java.util.Random;
import java.util.Arrays;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        System.out.println("=== Генератор случайных чисел ===");

        // Генерация чисел
        System.out.println("5 случайных чисел от 1 до 100:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.println("Число " + (i + 1) + ": " + numbers[i]);
        }

        // Сортировка и вывод
        System.out.println("\nОтсортированные числа:");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Число " + (i + 1) + ": " + numbers[i]);
        }
    }
}