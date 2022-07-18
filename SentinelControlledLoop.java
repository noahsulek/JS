import java.util.*;
/**
 * Averages a list of non-negative numbers entered by user.
 * User may choose to enter no values.
 *
 */
public class SentinelControlledLoop
{
    public static void main(String[] args){
        
        double value, average;
        double runningSum = 0;
        int numValues = 0;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Calculates the average of numbers.\n");
        
        System.out.print("Enter a value (a negative value to quit): ");
        value = scnr.nextDouble();
        while (value >= 0) {
            runningSum += value;
            numValues++;
            System.out.print("Enter a value (a negative value to quit): ");
            value = scnr.nextDouble();
        } // end while
        
        if (numValues > 0){
            average = runningSum / numValues;
            System.out.printf("Average = %.2f\n",average);
        }
        else {
            System.out.println("No non-negative values were entered");
        }
    }
    
    