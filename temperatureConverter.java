public class temperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celsius = 25.0;

        System.out.println("Конвертер температур");
        System.out.println(celsius + "°C = " + celsiusToFahrenheit(celsius) + "°F");
    }
}