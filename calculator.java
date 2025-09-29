public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

        System.out.println("калькулятор");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
        
        System.out.println(num1 + " / 0 = " + divide(num1, 0));
    }
}
}