import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

	    System.out.println( "Provide the cost of the meal and tip percentage," +
                "\nand this program will return the tip, tax and total for the meal. " );
        System.out.print( "Please enter the cost of the meal: " );

        double cost = input.nextDouble();

        System.out.print( "Please enter the desired tip percentage: " );

        double tipPercentage = input.nextDouble();

        double tipTotal = getTip(cost, tipPercentage);

        System.out.print( "\nThe tip for the meal at " + tipPercentage
                + " percent is $" );
        System.out.printf("%4.2f%n", tipTotal);

        double totalTax = getTax(cost, 3.2);

        System.out.print( "The tax for the meal is $");
        System.out.printf("%4.2f%n", totalTax) ;

        System.out.print( "The total cost of the meal is $");
        System.out.printf("%4.2f%n", (cost + tipTotal + totalTax));

    }

    public static double getTip(double mealCost, double percentage)
    {
        return mealCost * ( percentage / 100 );
    }

    public static double getTax(double mealCost, double taxPercentage)
    {
        return mealCost * ( taxPercentage / 100 );
    }

}
