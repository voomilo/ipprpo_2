public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

        System.out.println("Калькулятор");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
    }
}