import java.util.Scanner;
/** Assignment W9dot1
 * Kyle Johnson
 * CIT-260 Section 5
 * March 10, 2020
 *
 * This program retrieves x and y coordinates and then
 * calculates the distance between the origin (0,0) and
 * the given coordinates.
 */
public class Main {

    public static void main(String[] args) {
        // Initialize scanner to retrieve user input
        Scanner input = new Scanner(System.in);

        // Initialize origin "MyPoint" variable
        MyPoint p1 = new MyPoint();

        /* Used a variable to store coordinate values so as to implement
          both class constructors. An alternative could be as follows:

          MyPoint userPoint = new MyPoint();

          System.out.print("Enter a value to be used as an x-coordinate: ");
          userPoint.setX(input.nextDouble());

          System.out.print("Enter a value to be used as a y-coordinate: ");
          userPoint.setY( input.nextDouble() );
         */
        // Requests and stores a value for the X coordinate
        System.out.print("Enter a value to be used as an x-coordinate: ");
        double userXValue = input.nextDouble();

        // Requests and stores a value for the Y coordinate
        System.out.print("Enter a value to be used as a y-coordinate: ");
        double userYValue= input.nextDouble();

        // Combines user values into a MyPoint variable
        MyPoint userPoint = new MyPoint(userXValue, userYValue);

        // Displays the results of the first distance calculation method
        System.out.printf("Method 1 calculated the distance from " +
                        "(%3.2f , %3.2f) to (%3.2f , %3.2f) as %3.2f %n",
                p1.getX() , p1.getY(), userPoint.getX(), userPoint.getY(),
                p1.distance(userPoint.getX() , userPoint.getY()) );

        // Displays the results of the second distance calculation method
        System.out.printf("Method 2 calculated the distance from " +
                "(%3.2f , %3.2f) to (%3.2f , %3.2f) as %3.2f %n",
                p1.getX() , p1.getY(), userPoint.getX(), userPoint.getY(),
                p1.distance( userPoint ) );

        // Displays the results of the third distance calculation method
        System.out.printf("Method 3 calculated the distance from " +
                        "(%3.2f , %3.2f) to (%3.2f , %3.2f) as %3.2f %n",
                p1.getX() , p1.getY(), userPoint.getX(), userPoint.getY(),
                MyPoint.distance( p1, userPoint ) );

        //Display goodbye message
        System.out.println("\nGoodbye.");
    }
}
