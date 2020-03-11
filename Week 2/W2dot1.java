import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.println("Please enter a temperature in Celsius to convert: ");
        celsius = input.nextDouble();

        fahrenheit = toFahrenheit(celsius);

        System.out.printf("%n%3.2f degrees Celsius is equivalent to %n%3.2f degrees Fahrenheit.\n"
                , celsius
                , fahrenheit);
        System.out.println("Goodbye.");
    }

    public static double toFahrenheit(double celsiusTemp)
    {
        return ( (9.0 / 5.0) * celsiusTemp ) + 32;
    }

}
