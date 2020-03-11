import java.util.Scanner;

// Assignment W7dot2
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
        System.out.println("This program calculates the average and standard " +
                "deviation of " + AVERAGING_ARRAY_SIZE + " numbers.\n");

        // Initialize array
        double[] averageNumbers = new double[AVERAGING_ARRAY_SIZE];

        // Loop through array to retrieve numbers via user input
        for (int i = 0; i < averageNumbers.length; i++)
        {
            System.out.print("Please enter a number: ");
            averageNumbers[i] = input.nextDouble();
        }

        // Display result of running "average" method and std deviation using
        // user input values.
        System.out.printf("\nThe average of the " + AVERAGING_ARRAY_SIZE
                + " numbers entered is %3.2f.\n", mean(averageNumbers) );
        System.out.printf("The standard deviation is %3.2f",
                deviation(averageNumbers));
    }

    // Sums the numbers contained in array via for loop,
    // then divides the sum by the length of the array.
    public static double mean(double[ ] x)
    {
        double meanSum = 0;
        for (double v : x) meanSum += v;

        return meanSum / x.length;
    }

    // This method calculates the standard deviation via the formula provided.
    // Some steps are broken down for debugging purposes.
    public static double deviation(double[ ] x)
    {
        double stdDeviation = 0;
        double meanChi = mean(x);

        for ( double i : x)
        {
            double numerator = (i - meanChi);
            double numeratorSquared = Math.pow(numerator,2);
            stdDeviation += numeratorSquared;
        }

        // Factored this operation outside of the summation so that it
        // only has to be run once.
        stdDeviation /= (AVERAGING_ARRAY_SIZE - 1);

        return Math.sqrt(stdDeviation);

    }
}
