import java.util.Scanner;

/**
 * Represents a Circle
 * Extends Shape.
 */
public class Circle extends Shape{

    // Data Fields
    // The radius of the circle
    private double radius = 0;

    // Constructors
    public Circle() {
        super("Circle");
    }

    /** Constructs a rectangle of the specified size.
     * @param radius the radius
     */
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Methods

    /**
     * Get the radius
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /** Compute the area.
     * @return  The area of the circle
     */
    @Override
    public double computeArea() {
        return this.radius*this.radius*Math.PI;
    }

    /** Compute the perimeter.
     * @return  The perimeter of the circle
     */
    @Override
    public double computePerimeter() {
        return 2 * Math.PI * this.radius;
    }


    /** Read the attributes of the circle.
     */
    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle: ");
        this.radius = in.nextDouble();

    }

    /** Create a string representation of the circle.
     * @return A string representation of the circle
     */
    @Override
    public String toString() {
        return super.toString() + ": radius is "+this.radius;
    }
}
