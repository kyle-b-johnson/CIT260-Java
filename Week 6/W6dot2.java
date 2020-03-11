public class Main {

    // Assignment W6dot2
    // Kyle Johnson
    // CIT-260 Section 5
    // February 11, 2020

    public static void main(String[] args) {
	// write your code here
        // Initializes center dividing space for label row of table
        String center = "     |    ";

        // Displays message to user describing program function
        System.out.println("This program displays a table of " +
                "temperature conversions from\n31 - 40 degrees Celsius " +
                "to Fahrenheit in 1 degree increments\nand from 120-30  degrees " +
                "Fahrenheit to Celsius in 10 degree increments.\n");

        // Displays top row of table with proper formatting
        System.out.printf("%-15s%-10s" + center + "%-15s%-5s%n",
                "Celsius", "Fahrenheit", "Fahrenheit", "Celsius" );

        // Displays border row of table
        for(int i = 0; i < 58; i++ )
            System.out.print('-');

        // initializes fahrenheit temperature outside of loop so as
        // not to reset the value during each iteration of loop
        double f = 120.0;

        // Loop to display the temperatures
        for(double c = 40.0; c > 30; c--)
        {
            // Initialize center string for formatting
            center = "          |    ";

            // Display left side of each row
            System.out.printf("%n%-15.1f%5.1f", c, celsiusToFahrenheit(c));
            System.out.print(center);


            //Couldn't seem to figure out another way to integrate the right
            // side of the table within the same loop
            if (f > 29)
            {
                // Display right side of each row
                System.out.printf("%-15.1f%5.2f", f , fahrenheitToCelsius(f));

                // Decrement fahrenheit temperature to convert
                f -= 10;
            }
        }

        // Display goodbye message
        System.out.println("\n\nGoodbye.");
    }

    public static double celsiusToFahrenheit(double tempCelsius)
    {
        return ( tempCelsius * (9.0/5.0) ) + 32;
    }

    public static double fahrenheitToCelsius(double tempFahrenheit)
    {
        return ( ( tempFahrenheit - 32 )* (5.0/9.0) ) ;
    }
}

