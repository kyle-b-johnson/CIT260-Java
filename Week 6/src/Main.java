import java.util.Scanner;

public class Main {

    // Assignment W6dot1
    // Kyle Johnson
    // CIT-260 Section 5
    // February 11, 2020

    public static void main(String[] args)
    {
	    // Provide user with program description
        System.out.println("This program will return the growth of " +
                "an investment over 10 years provided a starting figure.\n");

        // Initialize input scanner
        Scanner input = new Scanner(System.in);

        // Get value for the investment amount
        System.out.print("\nPlease enter a figure greater than 0 " +
                "to use as an investment: ");
        double investmentNumber = input.nextDouble();

        // Get value for annual interest rate
        System.out.print("Please enter a figure between 0 and 100" +
                "to use as an Interest Rate: ");

        // Convert perentage to decimal
        double annualInterestRate = input.nextDouble()/100;

        // Format table
        System.out.printf("\n%-6s", "Years");
        System.out.printf("%-12s\n", "Future Value");

        // Loop through the 10 years of Future Value table
        for(int i = 1; i <=10; i++)
        {
            // Display year of table
            System.out.printf("%-6d", i);

            // Display value of year "i"
            System.out.printf("$%-4.2f\n", futureValue(investmentNumber,
                    annualInterestRate/12, i));
        }

        System.out.println("\nGoodbye.");
    }

    // Returns future value of investment using provided formula
    public static double futureValue(double investmentAmount,
             double monthlyInterestRate,
             int years)
    {
            return investmentAmount *
                    Math.pow(1 + monthlyInterestRate, years*12);
    }
}
