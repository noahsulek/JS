
/**
 * Write a description of class Comparisons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DoubleComparisons
{
    public static void main(String[] args){
        
        double x = 0.3;
        double y = 0.1 + 0.1 + 0.1;
        
        System.out.println("Comparing doubles...");
        System.out.println("\nUsing == operator");
        
        if (x == y){
            System.out.print("x = " + x + ", y = " + y);
            System.out.println(" - the same");
        }
        else {
            System.out.print("x = " + x + ", y = " + y);
            System.out.println(" - NOT the same");
        }
        
        
        // Check if within some threshold value of each other
        System.out.println("\nUsing closeness...");
        if (Math.abs(x - y) < .0000001){
            System.out.print("x = " + x + ", y = " + y);
            System.out.println(" - the same");
        }
        else {
            System.out.print("x = " + x + ", y = " + y);
            System.out.println(" - NOT the same");
        }
         
          
    }
}
