public class Main {

    public static void main(String[] args) {
        // initialize the object to store the dates in ms
        java.util.Date timeDate = new java.util.Date();

        System.out.println("This program uses the Date class and a loop to iterate\n" +
                "through dates in the form of millisecond values from " +
                "10^4 to 10^10.\n");

        /* Since each increase is by a factor of 10, I initialized a variable
        * at the initial value to be looped through and incremented for the
        * remainder of the program. */
        long timeMilliseconds = 10000;

        for (int i = 0; i < 7; i++) {

            // Set time of date object
            timeDate.setTime(timeMilliseconds);

            // Print long date form of date in milliseconds
            System.out.println(timeDate.toString());

            // Increase the time to be displayed in the next line by a factor of 10
            timeMilliseconds *= 10;
        }

        //Print goodbye message
        System.out.println("\nGoodbye.");

    }
}
