/*
    Assignment W3dot1
    Kyle Johnson
    CIT-260 Section 5
    January 21, 2020
 */

import java.util.Scanner;

public class Main {

    /*
        This program gets the current day of the week from the user
        expressed as an integer as well as an arbitrary number selected
        by the user to calculate what day of the week that future day will be.
     */
    public static void main(String[] args)
    {
        //Open input scanner
        Scanner input = new Scanner(System.in);

        //Provide description of program to user
        System.out.println("This program will determine the day of the\n" +
                "week of a future day provided the current day of the week\n" +
                "and the number of days in the future to calculate.\n");

        //Get user defined variable for the "current" day
        System.out.print("Enter today as a number (0 being Sunday, " +
                "6 being Saturday): ");
        int todayNumber = input.nextInt();

        // Display error and terminate program if entry is invalid as determined
        // by dateNumberChecker method.
        if(!dateNumberChecker(todayNumber))
        {
            System.out.println(todayNumber + " is an invalid input." +
                    " Number should be positive.");
            System.out.println("Goodbye.");
            System.exit(0);
        }

        // Get user defined variable for the number of days to count forward
        System.out.print("Enter a number of days to calcutlate into " +
                "the future: ");
        int futureDays = input.nextInt();

        // Display error and terminate program if entry is invalid as determined
        // by futureDateChecker method.
        if(!futureDateChecker(futureDays))
        {
            System.out.println(futureDays + " is an invalid input." +
                    " Number should be positive.");
            System.out.println("Goodbye.");
            System.exit(0);
        }

        //Retrieves the name of "today's" day of the week
        String todayName = getDayName(todayNumber);

        //Retrieves the name of the future day
        String futureDayName = getDayName( ( todayNumber + futureDays) % 7 );

        //Outputs the results to the user
        System.out.println("Today is " + todayName + " and the future day is " +
                futureDayName + ".");

    }

    /*
        This method verifies that the user's input for the day of the
        week corresponds to an actual day of the week as prescribed by
        the program. If it does, it returns a true value, otherwise it
        returns false.
     */
    public static boolean dateNumberChecker(int todaysDateNum)
    {
        if (todaysDateNum < 0 || todaysDateNum > 6)
            return false;
        else return true;
    }

    /*
        This method verifies that the user has put a valid, positive
        number for the number of days forward to count. If the number
        is invalid it returns false, otherwise it returns true.
     */
    public static boolean futureDateChecker(int futureDateNum)
    {
        if (futureDateNum < 0)
            return false;
        else return true;
    }

    /*
        This method returns the name of the day based on the value passed to
        it. Saturday is the default value to reduce the number of switch cases.
        Within the Main method, the calculation to determine the day is the sum
        of the "today" number and the number of days into the future. That sum
        then uses the modulo operator to determine how many days away from
        Sunday it is.
     */
    public static String getDayName(int dateNum)
    {
        String dateName = "Saturday";
        switch (dateNum)
        {
            case 0: dateName = "Sunday"; break;
            case 1: dateName = "Monday"; break;
            case 2: dateName = "Tuesday"; break;
            case 3: dateName = "Wednesday"; break;
            case 4: dateName = "Thursday"; break;
            case 5: dateName = "Friday"; break;
        }

        return dateName;
    }
}
