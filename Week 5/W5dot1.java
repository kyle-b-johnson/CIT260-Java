public class Main {

    // Assignment W5dot1
    // Kyle Johnson
    // CIT-260 Section 5
    // February 05, 2020

    // Global variable for conversion from kilograms to pounds
    public static double KILOGRAMS_TO_POUNDS = 2.2;

    public static void main(String[] args) {

        // Displays program overview for user
	    System.out.println("This program creates a conversion table of \n" +
                "kilograms to pounds in 2 kg increments from 1 to 15.\n");

	    //Iterating loop from 0-15
        for( int i = 0; i <= 15; i++ )
        {
            //prints first line
            if( i == 0 )
            {
                System.out.printf("%-12s", "kilograms");
                System.out.printf("%6s\n", "pounds");
                System.out.printf("%-12s", "---------");
                System.out.printf("%6s\n", "------");
            }

            // Prints mass and conversion for odd numbers
            if( i % 2 == 1 )
            {
                System.out.printf("%-12d", i);
                System.out.printf("%2.1f\n", getPounds(i));
            }
        }

        // Displays goodbye message
        System.out.println("Goodbye!");
    }

    // Provides conversion of kilograms to pounds
    public static double getPounds(double massInKilograms)
    {
        return massInKilograms * KILOGRAMS_TO_POUNDS;
    }
}
