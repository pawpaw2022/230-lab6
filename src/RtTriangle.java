import java.util.Scanner;

/**
 * Represents a RtTriangle 
 * Extends Shape.
 */
public class RtTriangle extends Shape{

    // Data Fields
    // The base of the RtTriangle
    private double base = 0;
    // The height of the RtTriangle
    private double height = 0;

    // Constructors
    public RtTriangle() {
        super("RtTriangle");
    }

    /** Constructs a RtTriangle of the specified size.
     * @param base the base
     * @param height = height
     */
    public RtTriangle(double base, double height) {
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }


    // Methods

    /**
     * Get the base
     * @return the base
     */
    public double getbase() {
        return base;
    }

    /**
     * Get the height
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /** Compute the area.
     * @return  The area of the RtTriangle
     */
    @Override
    public double computeArea() {
        return 0.5 * this.height * this.base;
    }

    /** Compute the perimeter.
     * @return  The perimeter of the RtTriangle
     */
    @Override
    public double computePerimeter() {
        double sqrThirdSide = (this.height * this.height) + (this.base * this.base);
        return this.height + this.base + Math.sqrt(sqrThirdSide);
    }


    /** Read the attributes of the RtTriangle. 
     */
    @Override
    public void readShapeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the RtTriangle: ");
        this.base = in.nextDouble();
        System.out.println("Enter the height of the RtTriangle: ");
        this.height = in.nextDouble();
    }

    /** Create a string representation of the RtTriangle.
     * @return A string representation of the RtTriangle
     */
    @Override
    public String toString() {
        return super.toString() + ": base is "+base + ", height is "+height;
    }
}
