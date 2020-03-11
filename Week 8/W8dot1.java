public class Main {

    public static void main(String[] args) {
	// Provide user with program description
        System.out.println("This program will output the dimensions and " +
                "calculated area and perimeter of pre-programmed rectangles.");

        // Initialize rectangles 1 and 2
        Rectangle number1 = new Rectangle(4,40);

        Rectangle number2 = new Rectangle(3.5,5);


        //Output Rectangle 1 information
        System.out.println("Rectangle 1:");
        System.out.printf("height = %3.2f\n", number1.getHeight());
        System.out.printf("width = %3.2f\n", number1.getWidth());
        System.out.printf("area = %3.2f\n", number1.getArea());
        System.out.printf("perimeter = %3.2f\n", number1.getPerimeter());

        //Output Rectangle 2 information
        System.out.println("\nRectangle 2:");
        System.out.printf("height = %3.2f\n", number2.getHeight());
        System.out.printf("width = %3.2f\n", number2.getWidth());
        System.out.printf("area = %3.2f\n", number2.getArea());
        System.out.printf("perimeter = %3.2f\n", number2.getPerimeter());

        System.out.println("\nGoodbye.");
    }


}


/**
 * Rectangle class creates rectangle objects with values for
 * width and height.
 */
class Rectangle {
    private double width;
    private double height;

    // Empty Rectangle object
    public Rectangle(){
        width = 0;
        height = 0;
    }

    /* Rectangle object with parameters */
    public Rectangle(double height, double width){
        this.width = width;
        this.height = height;

    }

    /* To only return the height of rectangle */
    public double getHeight() {
        return height;
    }

    /* To only return the width of rectangle */
    public double getWidth() {
        return width;
    }

    /* To only set or change height of rectangle object */
    public void setHeight(double height) {
        this.height = height;
    }

    /* To only set or change width of rectangle object */
    public void setWidth(double width) {
        this.width = width;
    }

    /* To return the calculated area of the specified rectangle */
    public double getArea() {
        return this.height * this.width;
    }

    /* To return the calculated perimeter of the specified rectangle */
    public double getPerimeter() {
        return (2 * this.height) + (2 * this.width);
    }
}
