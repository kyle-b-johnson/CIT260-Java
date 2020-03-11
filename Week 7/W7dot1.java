import java.util.Scanner;

// Assignment W7dot1
// Kyle Johnson
// CIT-260 Section 5
// February 19, 2020

public class Main {

    // Set Global variable for array size for reuse
    public static int AVERAGING_ARRAY_SIZE = 5;

    // Main method displays output and retrieves numbers to
    // be stored in array.
    public static void main(String[] args)
    {
        // Initialize Scanner object
        Scanner input = new Scanner(System.in);

        // Describe program function to user
        System.out.println("This program calculates the average of " +
                AVERAGING_ARRAY_SIZE + " numbers.\n");

        // Initialize array
        double[] averageNumbers = new double[AVERAGING_ARRAY_SIZE];

        // Loop through array to retrieve numbers via user input
        for (int i = 0; i < averageNumbers.length; i++)
        {
            System.out.print("Please enter a number: ");
            averageNumbers[i] = input.nextDouble();
        }

        // Display result of running "average" method, using
        // user input values.
        System.out.printf("\nThe average of the " + AVERAGING_ARRAY_SIZE
        + " numbers entered is %3.2f.", average(averageNumbers) );
    }

    // Sums the numbers contained in array via for loop,
    // then divides the sum by the length of the array.
    public static double average(double[ ] array)
    {
        double averageSum = 0;
        for (double v : array) averageSum += v;

        return averageSum / array.length;
    }
}
