import java.util.*;

/**
 * Write a description of class SwitchAndMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchMethodsDoWhile
{
    /** 
     * Purpose: calculates and returns circle area based radius
     * Input: Parameter - radius: double;
     * Output: Return of double: calculated area
     */
    
    public static double circArea (double rad) {
        return Math.PI * Math.pow(rad, 2);
    }
    
    /**
     * Purpose: Calculates and returns circle area based on diameter
     * Input: By user, diameter: double
     * Output: Return of double: calculated area
     * 
     * This method illustrates method overloading in Java.  Two methods with same name but different signatures.
     *   signature - is the combination of the method's name and its parameter list.
     *   For the method defined above, the signature is circArea(double).  
     *   For the method defined below, the signature is circArea().
     *   Same method names but different signatures.
     */
    public static double circArea () {
        double dia;
        Scanner scnr = new Scanner (System.in);
        
        System.out.print("Enter the circle's diameter: ");
        dia = scnr.nextDouble();
        
        return Math.PI/4 * Math.pow(dia, 2);
    }
    
    public static void main (String [] args) {
        char choice;
        double radius, area;
        Scanner scnr = new Scanner (System.in);
        
        
        do {
            System.out.println("What would you like to do?");
            System.out.println("A: Calculate the area of a circle based on its radius");
            System.out.println("B: Calculate the area of a circle based on its diameter");
            System.out.println("Q: Quit");
            
            System.out.print("\nEnter your choice: ");
            choice = scnr.next().toLowerCase().charAt(0);
            
            System.out.println();
            
            switch (choice) {
                case 'a': 
                    System.out.print("Enter the radius of the circle: ");
                    radius = scnr.nextDouble();
                    area = circArea(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;  //if you don't add in the break, it will then execute the code in the next case as well.
                case 'b':
                    area = circArea();
                    System.out.println("The area of the circle is: " + area);
                    break;
                case 'q':
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("You must enter \'A\', \'B\', or \'Q\'.");
          
            }  
            System.out.println();
        }while (choice != 'q');
    }
}
