import java.util.*;
/**
 * This loop uses a boolean variable
 */
public class BooleanVarControlledLoop
{
 
    public static void main(String[] args){
        
        double value, average;
        double runningSum = 0;
        int numValues = 0;
        char response;
        boolean loopAgain = true;
        Scanner scnr = new Scanner(System.in);
    
        System.out.println("This code calculates the average of numbers.\n");
        
        String msg = "Want to enter a value? Type y or n: ";
        System.out.println(msg);
        
        response = scnr.next().toUpperCase().charAt(0);
        loopAgain = response == 'Y';
        while (loopAgain) {
            System.out.print("Enter a value: ");
            value = scnr.nextDouble();
            runningSum += value;
            numValues++;
    
            System.out.println(msg);
            response =scnr.next().toUpperCase().charAt(0);
            loopAgain = response == 'Y';
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
