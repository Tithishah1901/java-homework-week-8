package poolarea;

public class Rectangle {
    /**
     * Write a class with the name Rectangle. The class needs two fields (instance variable) with name
     * width and length both of type double.
     * The class needs to have one constructor with parameters width and length both of type double and it
     * needs to initialize the fields.
     * In case the width parameter is less than 0 it needs to set the width field value to 0.
     * In case the length parameter is less than 0 it needs to set the length field value to 0.
     * Write the following methods (instance methods):
     * ●  Method named getWidth without any parameters, it needs to return the value of the width
     * field.
     * ●  Method named getLength without any parameters, it needs to return the value of the length
     * field.
     * ● Method named getArea without any parameters, it needs to return the calculated area
     * (width * length).
     */

    // instance variable
    private double width;
    private double length;

    // constructor
    public Rectangle(double width, double length) {
        // set width to 0 if negative
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        // set length to 0 if negative
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }
        // method to get the width
        public double getWidth(){
            return width;

        }
        // method to get the length
    public double getLength(){
        return length;
    }
    // method to calculate the area
    public double getArea(){
        return width * length;
    }
    }

