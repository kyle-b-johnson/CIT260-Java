/** Assignment W9dot1
* Kyle Johnson
* CIT-260 Section 5
* March 10, 2020
 *
 * This class is for the construction and manipulation of
 * cartesian coordinates- getting, storing, changing values
 * and calculating distances between two given points using
 * differing methods and constructions. The distance methods
 * are overloaded to create flexibility in the usage and
 * implementation of the method(s).
 */

public class MyPoint {
    private double x;
    private double y;

    // Empty constructor
    MyPoint()
    {
        x = 0;
        y = 0;
    }

    // Constructor with parameters
    MyPoint(double xValue, double yValue)
    {
        this.x = xValue;
        this.y = yValue;
    }

    /**
     * Method to return value for X coordinate
     * @return
     */
    public double getX ()
    {
        return this.x;
    }

    /**
     * Method to return value for Y coordinate
     * @return
     */
    public double getY ()
    {
        return this.y;
    }

    /**
     * Method to store or change value of X coordinate
     * @param xValue
     */
    public void setX (double xValue)
    {
        this.x = xValue;
    }

    /**
     * Method to store or change value of X coordinate
     * @param yValue
     */
    public void setY (double yValue)
    {
        this.y = yValue;
    }

    /**
     * Method to calculate distance between points, with one point
     * as the "base" point (ie. to only be used as a function of
     * a MyPoint object) and the coordinates of the other point.
     * @param xCoord
     * @param yCoord
     * @return
     */
    public double distance(double xCoord, double yCoord)
    {
        double radicand = Math.pow( (xCoord - this.x), 2)
                + Math.pow( (yCoord - this.y), 2 );

        return Math.sqrt(radicand);

    }

    /**
     * Method to calculate distance between points, with one point
     * as the "base" point (ie. to only be used as a function of
     * a MyPoint object) and another MyPoint.
     * @param p
     * @return
     */
    public double distance(MyPoint p)
    {
        double radicand = Math.pow( (p.x - this.x), 2)
                + Math.pow( (p.y - this.y), 2 );

        return Math.sqrt(radicand);

    }

    /**
     * Method to calculate distance between points, with two MyPoint objects.
     * (Can be used as a method of the MyPoint class or as a method of a
     * MyPoint object.
     * @param mp1
     * @param mp2
     * @return
     */
    public static double distance (MyPoint mp1, MyPoint mp2)
    {
        double radicand = Math.pow( (mp1.x - mp2.x), 2)
                + Math.pow( (mp1.y - mp2.y), 2 );

        return Math.sqrt(radicand);

    }
}
