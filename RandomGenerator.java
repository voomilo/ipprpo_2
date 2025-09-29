import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Генератор случайных чисел");
        System.out.println("5 случайных чисел от 1 до 100:");

        for (int i = 1; i <= 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Число " + i + ": " + randomNumber);
        }
    }
}