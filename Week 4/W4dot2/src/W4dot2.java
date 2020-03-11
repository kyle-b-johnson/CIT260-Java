import java.util.Scanner;

public class Main {
    // Assignment W4dot2
    // Kyle Johnson
    // CIT-260 Section 5
    // January 30, 2020

    //Initialize global variables for tax rates
    static final double FEDERAL_TAX_RATE = .20;
    static final double STATE_TAX_RATE = 0.09;

    // Program calculates and displays pay stub based on user inputs
    // of hours worked and pay rate. Additional methods are used for
    // calculation of gross pay, taxes and resulting net pay.
    public static void main(String[] args) {

        // Initialize Scanner object
        Scanner input = new Scanner(System.in);

        // Describe program to user
        System.out.println("Provide your name, hours worked, and wage and"
        + "\nthe gross pay for that period will be calculated in addition to" +
                "\nthe applicable state and federal taxes resulting in " +
                "the net pay for the period.");

        // Get user provided first and last name
        System.out.print("First name and Last name: ");
        String name = input.nextLine();

        // Get input provided by user for hours worked for week
        System.out.print("Weekly hours worked: ");
        double hoursWorked = input.nextDouble();

        // Get input provided by user for hourly wage
        System.out.print("Hourly wage: ");
        double hourlyWage = input.nextDouble();

        // Run calculation methods and store in variables
        double grossWages = getGrossPay(hoursWorked, hourlyWage);
        double stateTaxes = getStateTax(grossWages);
        double federalTaxes = getFederalTax(grossWages);
        double netWages = getNetPay(grossWages, stateTaxes, federalTaxes);

        // Output pay stub information via calculation methods' results
        System.out.printf("\nPay stub for " + name);
        System.out.printf("\nHours worked: %2.1f\n", hoursWorked);
        System.out.printf("Gross Pay: $%5.2f\n", grossWages);
        System.out.printf("State Tax Withheld: $%5.2f\n" , stateTaxes);
        System.out.printf("Federal Tax Withheld: $%5.2f\n" , federalTaxes);
        System.out.printf("Net Pay: $%5.2f\n" , netWages);
        System.out.println("\nGoodbye.");

    }

    // Calculates gross pay of user
    // Modularized for future use
    public static double getGrossPay (double hours, double wage)
    {
        return Math.round((hours * wage) * 100.00) / 100.00;
    }

    // Calculates applicable state tax amount
    // Modularized for future use
    public static double getStateTax(double grossPay)
    {
        return Math.round((grossPay * STATE_TAX_RATE) * 100.00 ) / 100.00 ;
    }

    // Calculates applicable federal tax amount
    // Modularized for future use
    public static double getFederalTax(double grossPay)
    {
        return Math.round((grossPay * FEDERAL_TAX_RATE) * 100.00) / 100.00;
    }

    // Calculates net pay
    // Modularized for future use
    public static double getNetPay (double grossPay, double stateTax
            , double fedTax)
    {
        return Math.round( (grossPay - (stateTax + fedTax) ) * 100.00) / 100.00;
    }


}
