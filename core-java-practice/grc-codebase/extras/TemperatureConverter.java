import java.util.*;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value = input.nextDouble();
        String type = input.next();

        if (type.equalsIgnoreCase("C")) {
            System.out.println(celsiusToFahrenheit(value));
        } else if (type.equalsIgnoreCase("F")) {
            System.out.println(fahrenheitToCelsius(value));
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
