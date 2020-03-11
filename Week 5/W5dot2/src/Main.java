public class Main {

    // Assignment W5dot2
    // Kyle Johnson
    // CIT-260 Section 5
    // February 05, 2020

    //Displays table of common multiples of 5 and 6
    public static void main(String[] args) {

        //Initialize counter for rows of numbers
        int rowCount = 0;

        //Output informing user of program function
        System.out.println("This program generates a table of common"
        + "multiples of 5 and 6.\n");

        //Loop to display common multiples
        //Increments by fives since 5 is lowest common multiple
        for( int i = 100; i <= 1000; i+=5 )
        {
            if( i % 5 == 0 && i % 6 == 0 )
            {
                System.out.printf("%-4d", i);
                rowCount++;

                //Outputs a line return after every 10 numbers displayed
                if(rowCount % 10 == 0)
                {
                    System.out.print('\n');
                }
            }
        }

        //Display goodbye
        System.out.println("Goodbye!");

    }
}
