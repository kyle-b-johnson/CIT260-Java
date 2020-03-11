/*
    Assignment W3dot2
    Kyle Johnson
    CIT-260 Section 5
    January 21, 2020
 */

import java.util.Scanner;

public class Main {

    /*
        This method retrieves inputs from a user in the form of two integers
        one as a year and the other as a calendar month (1-12). The program
        then calculates the number of days in that month. The year only having
        a bearing on the result for the month of February depending on whether
        the given year was or was not a leap year (thus having 28 or 29 days,
        respectively).
     */
    public static void main(String[] args)
    {
        //Open input scanner
        Scanner input = new Scanner(System.in);

        //Provide description of program to user
        System.out.println("This program, given a numerical year and month\n" +
                "calculates the number of days in that month.\n");

        //Get user defined variables
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print("Enter a numerical value for the month (1 - 12): ");
        int month = input.nextInt();

        //Display error and terminate program if entry is invalid
        if(!validateMonth(month))
        {
            System.out.print("\n" + month + " is an invalid entry. " +
                    "Entry should range from 1 to 12.\nGoodbye.");
            System.exit(0);
        }

        //Since majority of months have 31 days, have that value as default
        int monthDays = 31;

        //Reduce number of switch cases by one by having a default
        String monthName = "December";

        // Provide month names and number of days in month based on user entry
        // If the isLeapYear method finds a leap year, the days in February are
        // adjusted accordingly.
        switch (month)
        {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "Febrauary";
                if(isLeapYear(year)) monthDays = 29;
                else monthDays = 28;
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                monthDays = 30;
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                monthDays = 30;
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                monthDays = 30;
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                monthDays = 30;
                break;
        }

        //Provide user with results of program
        System.out.print( "\n" + monthName + " of " + year + " has "
                + monthDays + " days in it.\nGoodbye.");

    }

    /*
        This method, in the spirit of modularity determines whether the integer
        provided would follow the pattern of leap years. If it would be a leap
        year, the method returns true. If it would not be such a year, the
        method returns false.
     */
    public static boolean isLeapYear(int yearNum)
    {
        if(yearNum % 4 == 0 && yearNum % 100 != 0 )
            return true;
        else if (yearNum % 400 == 0)
            return true;
        else return false;
    }

    /*
        This method provides validation of the user input of the integer
        that is to represent a certain month of the year.
     */
    public static boolean validateMonth(int monthNum)
    {
        if (monthNum >= 1 && monthNum <= 12)
            return true;
        else return false;
    }
}
