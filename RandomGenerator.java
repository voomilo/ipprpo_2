import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("��������� ��������� �����");
        System.out.println("5 ��������� ����� �� 1 �� 100:");

        for (int i = 1; i <= 5; i++) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("����� " + i + ": " + randomNumber);
        }
    }
}