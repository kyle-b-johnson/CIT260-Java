import java.util.Scanner;

public class Main {
    // Assignment W4dot1
    // Kyle Johnson
    // CIT-260 Section 5
    // January 30, 2020

    // This program returns the binary equivalent of a singular,
    // user provided hexadecimal number (0-9, a-f)

    public static void main(String[] args) {
        // Initialize Scanner object
	Scanner input = new Scanner(System.in);

	//Provide description
	System.out.println("Provided a hexadecimal digit this program will \nreturn"
            + " the corresponding binary.");

	// Prompt for character
        System.out.print("Please enter a hexadecimal value: ");

	// Gets character as first entered character (ignores rest)
        // and converts to upper case for uniformity
	String stringHolder = input.next();
	char  hexValue = Character.toUpperCase(stringHolder.charAt(0));

	// Checks for valid entry and converts character to decimal equivalent
	int integerValue = getIntegerValue(hexValue);

	// Converts from decimal integer to binary string
	String binaryValue = getBinaryFromInteger(integerValue);

	// Provides user with result
    System.out.print("\nThe equivalent binary value of " + hexValue +
            " is: " + binaryValue);

    }

    public static int getIntegerValue(char userValue)
    {
        // Converts character to unicode integer
        int hexValueInt = userValue;

        //Check for digit value, convert to usable integer if valid
        if (hexValueInt >= 48 && hexValueInt <= 57)
            hexValueInt -= 48;

        else if (hexValueInt >= 65 && hexValueInt <= 70)
            hexValueInt -= 55;

        // Alerts user and terminates program if invalid input is detected
        else
        {
            System.out.println();
            System.out.println(userValue
                    + " is not a valid hexadecimal value."
                    + "\nGoodbye.");
            System.exit(0);
        }

        // Returns usable decimal integer for conversion
        return hexValueInt;
    }

    public static String getBinaryFromInteger (int userValueAsInt)
    {
        //Initialize Binary string
        String hexValueBinary = "";

        // Adds modulus of 2 to string and divides integer by 2. Loops
        // until 0 is reached.
        while (userValueAsInt > 0)
        {
            hexValueBinary = (userValueAsInt % 2) + hexValueBinary;
            userValueAsInt /= 2;
        }

        // Returns string
        return hexValueBinary;
    }
}
