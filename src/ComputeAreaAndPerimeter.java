import java.util.Scanner;

/**
 * Computes the area the perimeter of selected figures.
 * @author  Paul Sining Lu and Asyley
 */
public class ComputeAreaAndPerimeter {

    /**
     * The main program performs the following steps.
     * 1. It asks the user for the type of figure.
     * 2. It asks the user for the characteristics of the figure.
     * 3. It computes the perimeter.
     * 4. It computes the area
     * 5. It displays the result
     * @param args the command line arguments -- not used
     */
    public static void main(String[] args) {
        outerloop:
        while (true) {
            Shape myShape;
            double perimeter;
            double area;
            myShape = getShape(); // Ask for figure type
            myShape.readShapeData(); // Read the shape data
            perimeter = myShape.computePerimeter(); // Compute perimeter
            area = myShape.computeArea(); // Compute the area
            displayResult(myShape, area, perimeter); // Display the result

            Scanner sc = new Scanner(System.in);
            // Ask user if he/she wants to play again.
            String decision;
            // making a nested while loop in case that user doesn't type 'y' or 'n', we continue ask the user.
            while(true){
                // ask the user if he/she wants to play again
                System.out.println("\n");
                System.out.println("Do you want to run the program again (y for yes and n for no)?:");
                decision = sc.next();

                if (decision.equals("n")) {
                    break outerloop;
                } else if (decision.equals("y")) {
                    System.exit(0); // Exit the program
                }
                else {
                    System.out.println("Invalid Command, please type: y for yes and n for no");
                }
            }
        }
    }

    /** Ask the user for the type of figure
     * @return An instance of the selected shape
     */
    public static Shape getShape(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter C for circle");
        System.out.println("Enter R for rectangle");
        System.out.println("Enter T for Right Triangle");
        String figType = in.next();
        if (figType.equalsIgnoreCase("c")){
            return new Circle();
        }else if (figType.equalsIgnoreCase("r")){
            return new Rectangle();
        }else if (figType.equalsIgnoreCase("t")){
            return new RtTriangle();
        }else{
            return null;
        }
    }

    /**
     * Display the result of the computation
     * @param area The area of the figure
     * @param perim The perimeter of the figure
     */
    private static void displayResult(Shape myShape, double area, double perim){
        System.out.println(myShape);
        System.out.printf("The area is %.2f%nThe perimeter is %.2f%n", area, perim);
    }

}
