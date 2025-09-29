import java.util.Random;
import java.util.Arrays;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[5];

        System.out.println("=== ��������� ��������� ����� ===");

        // ��������� �����
        System.out.println("5 ��������� ����� �� 1 �� 100:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = random.nextInt(100) + 1;
            System.out.println("����� " + (i + 1) + ": " + numbers[i]);
        }

        // ���������� � �����
        System.out.println("\n��������������� �����:");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("����� " + (i + 1) + ": " + numbers[i]);
        }
    }
}