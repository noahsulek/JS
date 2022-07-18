import java.util.*;

/*
 * Computes the average of the values entered by the user.
 * The loop is designed to give user option to not
 * enter a value. 
 */
public class LoopingPossiblyNoEntry
{
 
    public static void main(String[] args){
        
        double value, average;
        double runningSum = 0;
        int numValues = 0;
        char response;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("This code calculates the average of numbers.\n");
        
        String msg = "Want to enter a value? Type y or n: ";
        System.out.println(msg);
        response = scnr.next().charAt(0);
        while (response == 'y' || response == 'Y') {
            System.out.print("Enter a value: ");
            value = scnr.nextDouble();
            runningSum += value;
            numValues++;
    
            System.out.println(msg);
            response = scnr.next().charAt(0);
        } // end while
    
        if (numValues > 0){
            average = runningSum / numValues;
            System.out.printf("Average = %.2f\n",average);
        }
        else {
            System.out.println("No values were entered");
        }
        scnr.close();
        
    }
}
